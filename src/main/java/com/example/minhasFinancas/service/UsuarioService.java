package com.example.minhasFinancas.service;

import java.util.Optional;

import com.example.minhasFinancas.model.entity.Usuario;

public interface UsuarioService {
	public Usuario autenticar(String email, String senha);
	
	public Usuario salvarUsuario(Usuario usuario);
	
	public void validarEmail(String email);
	
	public Optional<Usuario> obterPorId(Long id);
}
