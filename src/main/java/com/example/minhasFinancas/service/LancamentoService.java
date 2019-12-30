package com.example.minhasFinancas.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.example.minhasFiancas.model.enums.StatusLancamento;
import com.example.minhasFinancas.model.entity.Lancamento;

public interface LancamentoService {
	
	public Lancamento salvar(Lancamento lancamento);

	public Lancamento atualizar (Lancamento lancamento);
	
	public void deletar(Lancamento lancamento);
	
	public List<Lancamento> buscar(Lancamento lancamentoFiltro);
	
	public void atualizarStatus(Lancamento lancamento, StatusLancamento status);
	
	public void validar(Lancamento lancamento);
	
	public Optional<Lancamento> obterPorId(Long id);
	
	public BigDecimal obterSaldoPorUsuario(Long id);
}
