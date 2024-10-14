package com.ppp.demov2.Personal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Personal")
public class Personal {

    @Id
    private Long id;
    @Column(name = "nom_p")
    private String Nombre;
    @Column(name = "ape_p")
    private String Apellido;
    @Column(name = "cargo")
    private String Cargo;

    public Personal(Long id,String Nombre, String Apellido, String Cargo) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cargo = Cargo;
    }

    public Personal(String Nombre, String Apellido, String Cargo){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cargo = Cargo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public String getApellido(){
        return Apellido;
    }

    public void setApellido(String Apellido){
        this.Apellido = Apellido;
    }

    public String getCargo(){
        return Cargo;
    }

    public void setCargo(String Cargo){
        this.Cargo = Cargo;
    }
    
}
