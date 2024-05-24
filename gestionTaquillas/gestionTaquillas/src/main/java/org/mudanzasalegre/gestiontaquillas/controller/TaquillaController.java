package org.mudanzasalegre.gestiontaquillas.controller;

import org.mudanzasalegre.gestiontaquillas.model.Taquilla;
import org.mudanzasalegre.gestiontaquillas.service.TaquillaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TaquillaController {

    @Autowired
    private TaquillaService taquillaService;

    @GetMapping("/")
    public String viewHomePage(Model model,
                               @RequestParam(defaultValue = "0") int page,
                               @RequestParam(defaultValue = "10") int size,
                               @RequestParam(defaultValue = "Todos") String vestuario,
                               @RequestParam(defaultValue = "Todos") String sexo,
                               @RequestParam(defaultValue = "id") String sortField,
                               @RequestParam(defaultValue = "asc") String sortDirection) {
        Sort sort = Sort.by(sortField);
        sort = sortDirection.equals("asc") ? sort.ascending() : sort.descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<Taquilla> lista;

        if (vestuario.equals("Todos") && sexo.equals("Todos")) {
            lista = taquillaService.getAllTaquillas(pageable);
        } else if (!vestuario.equals("Todos") && sexo.equals("Todos")) {
            lista = taquillaService.getByVestuario(vestuario, pageable);
        } else if (vestuario.equals("Todos") && !sexo.equals("Todos")) {
            lista = taquillaService.getBySexo(sexo, pageable);
        } else {
            lista = taquillaService.getByVestuarioAndSexo(vestuario, sexo, pageable);
        }

        model.addAttribute("taquillas", lista);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", lista.getTotalPages());
        model.addAttribute("pageSize", size);
        model.addAttribute("selectedVestuario", vestuario);
        model.addAttribute("selectedSexo", sexo);
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDirection", sortDirection);
        model.addAttribute("reverseSortDirection", sortDirection.equals("asc") ? "desc" : "asc");
        return "index";
    }

    @GetMapping("/buscar")
    public String buscarTaquilla(@RequestParam("nombre") String nombre, Model model,
                                 @RequestParam(defaultValue = "0") int page,
                                 @RequestParam(defaultValue = "10") int size,
                                 @RequestParam(defaultValue = "Todos") String vestuario,
                                 @RequestParam(defaultValue = "Todos") String sexo,
                                 @RequestParam(defaultValue = "id") String sortField,
                                 @RequestParam(defaultValue = "asc") String sortDirection) {
        Sort sort = Sort.by(sortField);
        sort = sortDirection.equals("asc") ? sort.ascending() : sort.descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<Taquilla> lista = taquillaService.searchByNombreApellidos(nombre, pageable);

        model.addAttribute("taquillas", lista);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", lista.getTotalPages());
        model.addAttribute("pageSize", size);
        model.addAttribute("selectedVestuario", vestuario);
        model.addAttribute("selectedSexo", sexo);
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDirection", sortDirection);
        model.addAttribute("reverseSortDirection", sortDirection.equals("asc") ? "desc" : "asc");
        return "index";
    }

    @GetMapping("/vestuario")
    public String buscarPorVestuario(@RequestParam(value = "vestuario", required = false) String vestuario, Model model,
                                     @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size,
                                     @RequestParam(defaultValue = "Todos") String sexo,
                                     @RequestParam(defaultValue = "id") String sortField,
                                     @RequestParam(defaultValue = "asc") String sortDirection) {
        Sort sort = Sort.by(sortField);
        sort = sortDirection.equals("asc") ? sort.ascending() : sort.descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<Taquilla> lista;

        if (vestuario == null || vestuario.isEmpty() || vestuario.equals("Todos")) {
            lista = taquillaService.getAllTaquillas(pageable);
            vestuario = "Todos";
        } else if (sexo.equals("Todos")) {
            lista = taquillaService.getByVestuario(vestuario, pageable);
        } else {
            lista = taquillaService.getByVestuarioAndSexo(vestuario, sexo, pageable);
        }

        model.addAttribute("taquillas", lista);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", lista.getTotalPages());
        model.addAttribute("pageSize", size);
        model.addAttribute("selectedVestuario", vestuario);
        model.addAttribute("selectedSexo", sexo);
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDirection", sortDirection);
        model.addAttribute("reverseSortDirection", sortDirection.equals("asc") ? "desc" : "asc");
        return "index";
    }

    @GetMapping("/sexo")
    public String buscarPorSexo(@RequestParam(value = "sexo", required = false) String sexo, Model model,
                                @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size,
                                @RequestParam(defaultValue = "Todos") String vestuario,
                                @RequestParam(defaultValue = "id") String sortField,
                                @RequestParam(defaultValue = "asc") String sortDirection) {
        Sort sort = Sort.by(sortField);
        sort = sortDirection.equals("asc") ? sort.ascending() : sort.descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        Page<Taquilla> lista;

        if (sexo == null || sexo.isEmpty() || sexo.equals("Todos")) {
            lista = taquillaService.getAllTaquillas(pageable);
            sexo = "Todos";
        } else if (vestuario.equals("Todos")) {
            lista = taquillaService.getBySexo(sexo, pageable);
        } else {
            lista = taquillaService.getByVestuarioAndSexo(vestuario, sexo, pageable);
        }

        model.addAttribute("taquillas", lista);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", lista.getTotalPages());
        model.addAttribute("pageSize", size);
        model.addAttribute("selectedVestuario", vestuario);
        model.addAttribute("selectedSexo", sexo);
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDirection", sortDirection);
        model.addAttribute("reverseSortDirection", sortDirection.equals("asc") ? "desc" : "asc");
        return "index";
    }

    @GetMapping("/taquilla/nueva")
    public String mostrarFormularioNuevaTaquilla(Model model) {
        Taquilla taquilla = new Taquilla();
        model.addAttribute("taquilla", taquilla);
        model.addAttribute("editMode", false);
        return "formulario";
    }

    @GetMapping("/taquilla/editar/{id}")
    public String mostrarFormularioEditarTaquilla(@PathVariable("id") Long id, Model model) {
        Taquilla taquilla = taquillaService.getTaquillaById(id);
        model.addAttribute("taquilla", taquilla);
        model.addAttribute("editMode", true);
        return "formulario";
    }

    @PostMapping("/taquilla/guardar")
    public String guardarTaquilla(@ModelAttribute Taquilla taquilla, Model model, RedirectAttributes redirectAttributes) {
        try {
            boolean isEdit = (taquilla.getId() != null);

            if (isEdit) {
                Taquilla existingTaquilla = taquillaService.getTaquillaById(taquilla.getId());
                if (existingTaquilla != null && !existingTaquilla.getCodigoTaquilla().equals(taquilla.getCodigoTaquilla())) {
                    model.addAttribute("errorMessage", "El código de taquilla no se puede cambiar.");
                    return "formulario";
                }
            }

            taquillaService.guardar(taquilla);
            String successMessage = isEdit ? "Taquilla editada con éxito" : "Taquilla creada con éxito";
            redirectAttributes.addFlashAttribute("successMessage", successMessage);
            return "redirect:/";
        } catch (DataIntegrityViolationException e) {
            model.addAttribute("errorMessage", "El código de taquilla ya está en uso. Por favor, elige otro.");
            return "formulario";
        }
    }

    @GetMapping("/taquilla/eliminar/{id}")
    public String eliminarTaquilla(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
        try {
            taquillaService.eliminar(id);
            redirectAttributes.addFlashAttribute("successMessage", "Taquilla eliminada con éxito");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("errorMessage", "Error al eliminar la taquilla");
        }
        return "redirect:/";
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public String handleDataIntegrityViolationException(DataIntegrityViolationException e, Model model) {
        model.addAttribute("errorMessage", "El código de taquilla ya está en uso. Por favor, elige otro.");
        return "formulario";
    }
}
