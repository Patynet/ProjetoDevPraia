package com.cadastro.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.apirest.models.Praias;

public interface PraiasRepository extends JpaRepository <Praias, Long> {

	Praias findById(long id);
}
