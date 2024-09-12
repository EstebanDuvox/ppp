package com.ppp.demov2.Estudiantes;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(path = "/api/v0/estudiante")
public class ControladorEstudiante {
    
    private final ServicioEstudiante servicioEstudiante;
    
    public ControladorEstudiante(ServicioEstudiante servicioEstudiante) {
        this.servicioEstudiante = servicioEstudiante;
    }


    @GetMapping
    public List<Estudiante> getEstudiantes(){
        return servicioEstudiante.getEstudiantes();
    }
}
