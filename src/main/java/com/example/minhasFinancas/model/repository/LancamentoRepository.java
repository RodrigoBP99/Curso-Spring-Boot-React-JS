package com.example.minhasFinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.minhasFinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
 
}
