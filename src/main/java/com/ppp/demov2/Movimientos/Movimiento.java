package com.ppp.demov2.Movimientos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movimientos")
public class Movimiento {

    @Id
    private Long id;
    @Column(name="id_Estudiante")
    private Long idEstudiante;
    @Column(name="id_Personal")
    private Long idPersonal;
    @Column(name="id_Libro")
    private Long idLibro;
    @Column(name="Fechaprestado")
    private Date fechaprestado;
    @Column(name="Fecharestitucion")
    private Date fecharestitucion;

    public Movimiento(Long id, Long estudiante, Long personal, Long libro, Date prestado, Date devuelto) {
        this.idEstudiante = id;
        this.idEstudiante = estudiante;
        this.idPersonal = personal;
        this.idLibro = libro;
        this.fechaprestado = prestado;
        this.fecharestitucion = devuelto;
    }

    public Movimiento(Long estudiante, Long personal, Long libro, Date prestado, Date devuelto) {
        this.idEstudiante = estudiante;
        this.idPersonal = personal;
        this.idLibro = libro;
        this.fechaprestado = prestado;
        this.fecharestitucion = devuelto;
    }

    public Long getid(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getEstudiante(){
        return idEstudiante;
    }

    public void setEstudiante(Long estudiante){
        this.idEstudiante = estudiante;
    }

    public Long getPersonal(){
        return idPersonal;
    }

    public void setPersonal(Long personal){
        this.idPersonal = personal;
    }

    public Long getLibro(){
        return idLibro;
    }

    public void setLibro(Long libro){
        this.idLibro = libro;
    }

    public Date getPrestado(){
        return fechaprestado;
    }
    
    public void setPrestado(Date prestado){
        this.fechaprestado = prestado;
    }

    public Date getDevuelto(){
        return fecharestitucion;
    }

    public void setDevuelto(Date devuelto){
        this.fecharestitucion = devuelto;
    }
    
}
