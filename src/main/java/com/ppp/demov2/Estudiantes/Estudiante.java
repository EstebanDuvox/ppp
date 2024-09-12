package com.ppp.demov2.Estudiantes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Estudiantes")
public class Estudiante {

    @Id
    private Long id_estudiante;
    @Column(name = "nom_e")
    private String nombre;
    @Column(name = "ap_e")
    private String apellido;
    @Column(name = "cur_e")
    private String curso;
    @Column(name = "div_e")
    private String division;

public Estudiante (Long id, String nombre, String apellido, String curso, String division) {
    this.id_estudiante = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.curso = curso;
    this.division = division;
}

public Estudiante (String nombre, String apellido, String curso, String division) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.curso = curso;
    this.division = division;
}

public Long getId() {
    return id_estudiante;
}

public void setId(Long id) {
    this.id_estudiante = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public String getCurso() {
    return curso; 
}

public void setCurso(String curso) {
    this.curso = curso;
}

public String getDivision(){
    return division;
}

public void setDivision(String division){
    this.division = division;
}
}


