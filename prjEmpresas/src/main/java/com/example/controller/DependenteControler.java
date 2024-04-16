package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Dependente;
import com.example.services.DependenteService;

@RestController
@RequestMapping("/dependente")
public class DependenteControler {

	private final DependenteService dependenteService;

	@Autowired
	public DependenteControler(DependenteService dependenteService) {
		this.dependenteService = dependenteService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Dependente> findDependentebyId(@PathVariable Long id) {
		Dependente dependente = dependenteService.getDependentesById(id);
		if (dependente != null) {
			return ResponseEntity.ok(dependente);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/")
	public ResponseEntity<List<Dependente>> findAllUsuarioscontrol() {
		List<Dependente> dependente = dependenteService.getAllDependentes();
		return ResponseEntity.ok(dependente);
	}

	@PostMapping("/")
	public ResponseEntity<Dependente> insertUsuariosControl(@RequestBody Dependente dependente) {
		Dependente novodependente = dependenteService.saveDependente(dependente);
		return ResponseEntity.status(HttpStatus.CREATED).body(novodependente);
	}

}
