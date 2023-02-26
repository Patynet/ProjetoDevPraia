package com.cadastro.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.apirest.models.Bairros;

public interface BairrosRepository extends JpaRepository <Bairros, Long> {

	Bairros findById(long id);
}
