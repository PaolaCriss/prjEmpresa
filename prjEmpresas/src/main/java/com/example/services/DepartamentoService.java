package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Departamento;
import com.example.entities.Dependente;
import com.example.repositories.DepartamentoRepository;
import com.example.repositories.DependenteRepository;

@Service
public class DepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepository;

	public List<Departamento> getAllDepartamento() {
		return departamentoRepository.findAll();
	}

	public Departamento getDepartamentoById(long depacodigo) {
		return departamentoRepository.findById(depacodigo).orElse(null);
	}

	public Departamento saveDepartamento(Departamento departamento) {
		return departamentoRepository.save(departamento);
	}

}