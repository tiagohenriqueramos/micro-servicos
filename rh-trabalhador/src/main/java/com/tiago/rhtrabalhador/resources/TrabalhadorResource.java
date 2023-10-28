package com.tiago.rhtrabalhador.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiago.rhtrabalhador.entities.Trabalhador;
import com.tiago.rhtrabalhador.repositories.TrabalhadorRepository;

@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorResource {

	@Autowired
	private TrabalhadorRepository repository;

	@GetMapping
	public ResponseEntity<List<Trabalhador>> findAll() {
		List<Trabalhador> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Trabalhador> findById(@PathVariable Long id) {
		Trabalhador obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}

}
