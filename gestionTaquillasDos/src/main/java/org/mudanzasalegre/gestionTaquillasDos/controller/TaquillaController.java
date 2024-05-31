package org.mudanzasalegre.gestionTaquillasDos.controller;

import org.mudanzasalegre.gestionTaquillasDos.model.Taquilla;
import org.mudanzasalegre.gestionTaquillasDos.model.Vestuario;
import org.mudanzasalegre.gestionTaquillasDos.service.TaquillaService;
import org.mudanzasalegre.gestionTaquillasDos.service.VestuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/taquillas")
public class TaquillaController {

    @Autowired
    private TaquillaService taquillaService;

    @Autowired
    private VestuarioService vestuarioService;

    @GetMapping
    public String listTaquillas(Model model,
                                @RequestParam(defaultValue = "0") int page,
                                @RequestParam(defaultValue = "10") int size,
                                @RequestParam(defaultValue = "") String vestuarioId,
                                @RequestParam(defaultValue = "") String nombreApellidos) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Taquilla> taquillasPage;
        String vestuarioNombre = "Todos";
        boolean noResults = false;

        if (!vestuarioId.isEmpty() && !nombreApellidos.isEmpty()) {
            taquillasPage = taquillaService.searchByVestuarioIdAndNombreApellidos(Integer.parseInt(vestuarioId), nombreApellidos, pageable);
        } else if (!vestuarioId.isEmpty()) {
            taquillasPage = taquillaService.findByVestuarioId(Integer.parseInt(vestuarioId), pageable);
            Vestuario vestuario = vestuarioService.findById(Integer.parseInt(vestuarioId));
            if (vestuario != null) {
                vestuarioNombre = vestuario.getNombre();
            }
        } else if (!nombreApellidos.isEmpty()) {
            taquillasPage = taquillaService.searchByNombreApellidos(nombreApellidos, pageable);
        } else {
            taquillasPage = taquillaService.findAll(pageable);
        }

        if (taquillasPage.isEmpty()) {
            noResults = true;
        }

        model.addAttribute("taquillas", taquillasPage);
        model.addAttribute("vestuarios", vestuarioService.findAll());
        model.addAttribute("currentPage", taquillasPage.getNumber());
        model.addAttribute("totalPages", taquillasPage.getTotalPages());
        model.addAttribute("pageSize", taquillasPage.getSize());
        model.addAttribute("vestuarioId", vestuarioId);
        model.addAttribute("vestuarioNombre", vestuarioNombre);
        model.addAttribute("nombreApellidos", nombreApellidos);
        model.addAttribute("noResults", noResults);

        return "taquillas/taquillas";
    }



    @GetMapping("/search")
    public String searchTaquillas(@RequestParam("nombreApellidos") String nombreApellidos,
                                  @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size, Model model) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Taquilla> taquillas = taquillaService.searchByNombreApellidos(nombreApellidos, pageable);
        model.addAttribute("taquillas", taquillas);
        model.addAttribute("vestuarios", vestuarioService.findAll());
        model.addAttribute("nombreApellidos", nombreApellidos);
        return "taquillas/taquillas";
    }

    @GetMapping("/new")
    public String newTaquilla(Model model) {
        model.addAttribute("taquilla", new Taquilla());
        model.addAttribute("vestuarios", vestuarioService.findAll());
        model.addAttribute("action", "Crear");
        return "taquillas/newTaquilla";
    }

    @PostMapping
    public String saveTaquilla(@ModelAttribute Taquilla taquilla, Model model) {
        Taquilla existingTaquilla = taquillaService.findByCodigoTaquilla(taquilla.getCodigoTaquilla());
        boolean isNew = (taquilla.getId() == null);

        if (existingTaquilla != null && (isNew || !existingTaquilla.getId().equals(taquilla.getId()))) {
            model.addAttribute("errorMessage", "Ya existe una taquilla con este código.");
            model.addAttribute("taquilla", taquilla);
            model.addAttribute("vestuarios", vestuarioService.findAll());
            model.addAttribute("action", isNew ? "Crear" : "Editar");
            return "taquillas/newTaquilla";
        }

        try {
            taquillaService.save(taquilla);
            model.addAttribute("successMessage", "Taquilla guardada correctamente.");
        } catch (DataIntegrityViolationException e) {
            model.addAttribute("errorMessage", "Error al guardar la taquilla. Verifique los datos e intente nuevamente.");
            model.addAttribute("taquilla", taquilla);
            model.addAttribute("vestuarios", vestuarioService.findAll());
            model.addAttribute("action", isNew ? "Crear" : "Editar");
            return "taquillas/newTaquilla";
        }
        return "redirect:/taquillas";
    }


    @GetMapping("/edit/{id}")
    public String editTaquilla(@PathVariable Integer id, Model model) {
        Taquilla taquilla = taquillaService.findById(id);
        if (taquilla != null) {
            model.addAttribute("taquilla", taquilla);
            model.addAttribute("vestuarios", vestuarioService.findAll());
            model.addAttribute("action", "Editar");
            return "taquillas/newTaquilla";
        } else {
            model.addAttribute("errorMessage", "Taquilla no encontrada.");
            return "redirect:/taquillas";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteTaquilla(@PathVariable Integer id, Model model, RedirectAttributes redirectAttributes) {
        try {
            taquillaService.deleteById(id);
            redirectAttributes.addFlashAttribute("successMessage", "Taquilla eliminada correctamente.");
        } catch (DataIntegrityViolationException e) {
            redirectAttributes.addFlashAttribute("errorMessage", "Error al eliminar la taquilla. Puede estar asignada a un vestuario.");
        }
        return "redirect:/taquillas";
    }

}
