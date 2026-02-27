package org.ieselcaminas.jpa.repository;

import org.ieselcaminas.jpa.entity.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface NoteRepository extends CrudRepository<Note, Long> {

}