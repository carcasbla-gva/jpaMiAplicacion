package org.ieselcaminas.jpa.repository;

import org.ieselcaminas.jpa.entity.Ordenador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface OrdenadorRepository extends CrudRepository<Ordenador, Long> {
    List<Ordenador> findAll();
}