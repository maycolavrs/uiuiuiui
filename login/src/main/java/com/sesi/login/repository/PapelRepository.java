package com.sesi.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesi.login.model.Papel;

@Repository
public interface PapelRepository extends JpaRepository<Papel, Long>{
	Papel findByNomePapel(String nomePapel);

}
