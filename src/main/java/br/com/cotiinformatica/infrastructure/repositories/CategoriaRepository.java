package br.com.cotiinformatica.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cotiinformatica.domain.models.entities.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, UUID> {

}
