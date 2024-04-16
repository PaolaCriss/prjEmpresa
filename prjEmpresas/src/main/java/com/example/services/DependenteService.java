package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Dependente;
import com.example.repositories.DependenteRepository;
import com.example.repositories.FuncionarioRepository;

@Service
public class DependenteService {

	@Autowired
	private DependenteRepository dependenteRepository;

	public List<Dependente> getAllDependentes() {
		return dependenteRepository.findAll();
	}

	public Dependente getDependentesById(long depcodigo) {
		return dependenteRepository.findById(depcodigo).orElse(null);
	}

	public Dependente saveDependente(Dependente dependente) {
		return dependenteRepository.save(dependente);
	}

}