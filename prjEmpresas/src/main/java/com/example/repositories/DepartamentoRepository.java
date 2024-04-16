package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Departamento;
import com.example.entities.Dependente;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

}
