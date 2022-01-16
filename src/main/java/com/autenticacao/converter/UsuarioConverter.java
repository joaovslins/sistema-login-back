package com.autenticacao.converter;

import static java.util.Optional.ofNullable;

import org.springframework.stereotype.Component;

import com.autenticacao.domain.Usuario;
import com.autenticacao.dto.UsuarioDTO;

@Component
public class UsuarioConverter implements Converter<Usuario, UsuarioDTO>{

	
	@Override
	public UsuarioDTO from(Usuario entity) {
		UsuarioDTO dto = new UsuarioDTO();
		
		ofNullable(entity.getId()).ifPresent(dto::setId);
		ofNullable(entity.getUsuario()).ifPresent(dto::setUsuario);
		ofNullable(entity.getSenha()).ifPresent(dto::setSenha);	
	
		return dto;
	}
	
	@Override
	public Usuario to(UsuarioDTO dto) {
		Usuario entity = new Usuario();
		
		ofNullable(dto.getId()).ifPresent(entity::setId);
		ofNullable(dto.getUsuario()).ifPresent(entity::setUsuario);
		ofNullable(dto.getSenha()).ifPresent(entity::setSenha);
		
		return entity;
	}
	
	public Usuario to(UsuarioDTO dto, Usuario entity) {
		
		ofNullable(dto.getId()).ifPresent(entity::setId);
		ofNullable(dto.getUsuario()).ifPresent(entity::setUsuario);
		ofNullable(dto.getSenha()).ifPresent(entity::setSenha);
		
		
		return entity;
	}
	
	
	
}
