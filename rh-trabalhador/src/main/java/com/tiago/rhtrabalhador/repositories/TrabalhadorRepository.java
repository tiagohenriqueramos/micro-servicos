package com.tiago.rhtrabalhador.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiago.rhtrabalhador.entities.Trabalhador;

public interface TrabalhadorRepository extends JpaRepository<Trabalhador, Long> {

}
