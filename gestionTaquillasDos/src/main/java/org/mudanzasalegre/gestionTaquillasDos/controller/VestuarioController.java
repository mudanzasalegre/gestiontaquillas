/*
 * Gestión de Taquillas App - Propiedad Intelectual
 * Derechos de autor (c) - 2024 - mudanzasalegre
 * 
 * Este software y la documentación asociada son propiedad de JL Alegre (el "Autor").
 * 
 * Permiso de uso:
 * Se concede permiso para usar este software y la documentación asociada para fines internos dentro de [Nombre de la Institución] únicamente.
 * 
 * Restricciones:
 * 1. No se permite la copia, modificación, distribución, venta, sublicencia o transferencia de este software sin el permiso expreso y por escrito del Autor.
 * 2. Este software no puede ser usado para fines comerciales sin el consentimiento previo por escrito del Autor.
 * 
 * Propiedad Intelectual:
 * Este software es y seguirá siendo propiedad intelectual del Autor.
 * 
 * Garantía y Responsabilidad:
 * Este software se proporciona "tal cual", sin garantía de ningún tipo, expresa o implícita, incluyendo pero no limitándose a las garantías de comerciabilidad, idoneidad para un propósito particular y no infracción. En ningún caso el Autor será responsable por cualquier reclamo, daño o responsabilidad, ya sea en una acción de contrato, agravio o de otro tipo, que surja de o en conexión con el software o el uso u otros tratos en el software.
 * 
 * Contacto:
 * Para solicitar permiso o información adicional, por favor contacta a mudanzasalegre@hotmail.com
 */

package org.mudanzasalegre.gestionTaquillasDos.controller;

import org.mudanzasalegre.gestionTaquillasDos.model.Vestuario;
import org.mudanzasalegre.gestionTaquillasDos.service.VestuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/vestuarios")
public class VestuarioController {

    @Autowired
    private VestuarioService vestuarioService;

    @GetMapping
    public String listVestuarios(Model model, @RequestParam(defaultValue = "nombre") String sortField, 
                                 @RequestParam(defaultValue = "asc") String sortDir) {
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                                                                      Sort.by(sortField).descending();
        model.addAttribute("vestuarios", vestuarioService.findAll(sort));
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reverseSortDir", sortDir.equalsIgnoreCase("asc") ? "desc" : "asc");
        return "vestuarios/vestuarios";
    }

    @GetMapping("/new")
    public String newVestuario(Model model) {
        model.addAttribute("vestuario", new Vestuario());
        model.addAttribute("action", "Crear");
        return "vestuarios/newVestuario";
    }

    @PostMapping
    public String saveVestuario(@ModelAttribute Vestuario vestuario, Model model) {
        Vestuario existingVestuario = vestuarioService.findByNombre(vestuario.getNombre());
        if (existingVestuario != null && !existingVestuario.getId().equals(vestuario.getId())) {
            model.addAttribute("errorMessage", "Ya existe un vestuario con este nombre.");
            model.addAttribute("vestuario", vestuario);
            model.addAttribute("action", vestuario.getId() == null ? "Crear" : "Editar");
            return "vestuarios/newVestuario";
        }

        try {
            vestuarioService.save(vestuario);
            model.addAttribute("successMessage", "Vestuario guardado correctamente.");
        } catch (DataIntegrityViolationException e) {
            model.addAttribute("errorMessage", "No se ha podido guardar el vestuario. Verifique los datos e intente nuevamente.");
            model.addAttribute("vestuario", vestuario);
            model.addAttribute("action", vestuario.getId() == null ? "Crear" : "Editar");
            return "vestuarios/newVestuario";
        }
        return "redirect:/vestuarios";
    }

    @GetMapping("/edit/{id}")
    public String editVestuario(@PathVariable Integer id, Model model) {
        Vestuario vestuario = vestuarioService.findById(id);
        if (vestuario != null) {
            model.addAttribute("vestuario", vestuario);
            model.addAttribute("action", "Editar");
            return "vestuarios/newVestuario";
        } else {
            model.addAttribute("errorMessage", "Vestuario no encontrado.");
            return "redirect:/vestuarios";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteVestuario(@PathVariable Integer id, Model model) {
        try {
            vestuarioService.deleteById(id);
            model.addAttribute("successMessage", "Vestuario eliminado correctamente.");
        } catch (DataIntegrityViolationException e) {
            model.addAttribute("errorMessage", "No se puede eliminar el vestuario porque tiene taquillas asignadas.");
        }
        model.addAttribute("vestuarios", vestuarioService.findAll());
        return "vestuarios/vestuarios";
    }
}
