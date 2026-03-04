package org.ieselcaminas.jpa.controller;

import org.ieselcaminas.jpa.entity.Aula;
import org.ieselcaminas.jpa.entity.Ordenador;
import org.ieselcaminas.jpa.repository.AulaRepository;
import org.ieselcaminas.jpa.repository.OrdenadorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WebController {

    private final OrdenadorRepository ordenadorRepository;
    private final AulaRepository aulaRepository;

    // Constructor
    public WebController(OrdenadorRepository ordenadorRepository, AulaRepository aulaRepository) {
        this.ordenadorRepository = ordenadorRepository;
        this.aulaRepository = aulaRepository;
    }

    @GetMapping("/")
    public String mostrarIndex(Model model) {
        List<Ordenador> listaOrdenadores = ordenadorRepository.findAll();
        model.addAttribute("ordenadores", listaOrdenadores);
        return "index";
    }

    // Formulario
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        // Le pasamos las aulas a la vista para rellenar el <select>
        model.addAttribute("aulas", aulaRepository.findAll());
        return "formulario";
    }

    // Boton de Guardar
    @PostMapping("/guardar")
    public String guardarOrdenador(Ordenador ordenador) {
        ordenadorRepository.save(ordenador);
        // Redirigimos a la página principal para ver el nuevo PC
        return "redirect:/";


    }
    // Aula
    @GetMapping("/nueva-aula")
    public String mostrarFormularioAula() {
        return "formulario-aula";
    }

    @PostMapping("/guardar-aula")
    public String guardarAula(Aula aula) {
        aulaRepository.save(aula);
        return "redirect:/";
    }
}
