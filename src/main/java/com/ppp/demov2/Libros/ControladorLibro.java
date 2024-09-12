package com.ppp.demov2.Libros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v0/Libro")
public class ControladorLibro {

    private final ServicioLibro servicioLibro;

    public ControladorLibro (ServicioLibro servicioLibro) {
        this.servicioLibro = servicioLibro;
    }

    @GetMapping
    public List<Libro> getLibros() {
        return servicioLibro.getLibros();
    }
}
