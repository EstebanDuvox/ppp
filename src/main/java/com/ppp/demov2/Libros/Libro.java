package com.ppp.demov2.Libros;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Libros")
public class Libro {

    @Id
    private Long id;
    @Column(name="tit_l")
    private String titulo;
    @Column(name="id_autor")
    private Long idAutor;

    public Libro(Long id, String titulo, Long idAutor){
        this.id = id;
        this.titulo = titulo;
        this.idAutor = idAutor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getIdAutor(){
        return idAutor;
    }

    public void setIdAutor(Long idAutor){
        this.idAutor = idAutor;
    }

}
