package org.ieselcaminas.jpa.entity;

import jakarta.persistence.*;
import org.ieselcaminas.jpa.entity.Aula;

@Entity
@Table(name = "ordenadores")
public class Ordenador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String imagen;

    @ManyToOne
    @JoinColumn(name = "aula_id", nullable = false)
    private Aula aula;

    public Ordenador() {}
    // Constructor
    public Ordenador(String marca, String imagen, Aula aula) {
        this.marca = marca;
        this.imagen = imagen;
        this.aula = aula;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }
}