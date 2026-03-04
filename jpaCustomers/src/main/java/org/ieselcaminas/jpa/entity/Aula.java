package org.ieselcaminas.jpa.entity;

import jakarta.persistence.*;
import org.ieselcaminas.jpa.entity.Ordenador;

import java.util.List;

@Entity
@Table(name = "aulas")
public class Aula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "aula", cascade = CascadeType.ALL)
    private List<Ordenador> ordenadores;
    public Aula() {}
    // Constructor
    public Aula(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
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

    public List<Ordenador> getOrdenadores() {
        return ordenadores;
    }

    public void setOrdenadores(List<Ordenador> ordenadores) {
        this.ordenadores = ordenadores;
    }
}