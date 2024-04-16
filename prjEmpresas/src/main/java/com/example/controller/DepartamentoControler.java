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

import com.example.entities.Departamento;
import com.example.entities.Dependente;
import com.example.services.DepartamentoService;
import com.example.services.DepartamentoService;

@RestController
@RequestMapping("/departamento")
public class DepartamentoControler {

	private final DepartamentoService departamentoService;

	@Autowired
	public DepartamentoControler(DepartamentoService departamentoService) {
		this.departamentoService = departamentoService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Departamento> findDepartamentoById(@PathVariable Long id) {
		Departamento departamento = departamentoService.getDepartamentoById(id);
		if (departamento != null) {
			return ResponseEntity.ok(departamento);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/")
	public ResponseEntity<List<Departamento>> findAllUsuarioscontrol() {
		List<Departamento> departamento = departamentoService.getAllDepartamento();
		return ResponseEntity.ok(departamento);
	}

	@PostMapping("/")
	public ResponseEntity<Departamento> insertUsuariosControl(@RequestBody Departamento departamento) {
		Departamento novodepartamento = departamentoService.saveDepartamento(departamento);
		return ResponseEntity.status(HttpStatus.CREATED).body(novodepartamento);
	}

}

