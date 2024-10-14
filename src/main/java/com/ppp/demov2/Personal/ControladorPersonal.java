package com.ppp.demov2.Personal;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v0/Personal")
public class ControladorPersonal {

    private final ServicioPersonal servicioPersonal;

    public ControladorPersonal(ServicioPersonal servicioPersonal) {
        this.servicioPersonal = servicioPersonal;
    }

    public List<Personal> getPersonal(){
        return servicioPersonal.getPersonal();
    }
}
