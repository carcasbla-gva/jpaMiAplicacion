package org.ieselcaminas.jpa.repository;

import org.ieselcaminas.jpa.entity.Aula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface AulaRepository extends CrudRepository<Aula, Long> {
}