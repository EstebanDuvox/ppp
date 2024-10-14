package com.ppp.demov2.Movimientos;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v0/Movimiento")
public class ControladorMovimiento {

    private final ServicioMovimiento servicioMovimiento;

    public ControladorMovimiento(ServicioMovimiento servicioMovimiento) {
        this.servicioMovimiento = servicioMovimiento;
    }

    public List<Movimiento> getMovimiento(){
        return servicioMovimiento.getMovimiento();
    }
}