package model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Caffetteria;


@Repository
public interface CaffeteriaRepository extends JpaRepository<Caffetteria, Integer>{
	Caffetteria findByCodice (String codice);
}

