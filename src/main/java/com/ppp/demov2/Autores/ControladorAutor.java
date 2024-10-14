package com.ppp.demov2.Autores;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v0/Autor")
public class ControladorAutor {

    private final ServicioAutor servicioAutor;

    public ControladorAutor(ServicioAutor servicioAutor){
        this.servicioAutor = servicioAutor;
    }

    public List<Autor> getAutor(){
        return servicioAutor.getAutor();
    }

}
