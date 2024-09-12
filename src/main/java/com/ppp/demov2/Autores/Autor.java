package com.ppp.demov2.Autores;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Autores")
public class Autor {
    
    @Id
    private Long id;
    @Column(name = "nom_a")
    private String nombre;
    @Column(name = "ap_a")
    private String apellido;

    public Autor (Long id, String  nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Autor (String nombre,  String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
