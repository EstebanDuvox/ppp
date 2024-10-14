package com.ppp.demov2.Usuarios;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v0/Usuario")
public class ControladorUsuario {

    private final ServicioUsuario servicioUsuario;

    public  ControladorUsuario(ServicioUsuario servicioUsuario) {
        this.servicioUsuario = servicioUsuario;
    }
    
    public List<Usuario> getUsuario(){
        return servicioUsuario.getUsuario();
    }
    
}
