package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}

