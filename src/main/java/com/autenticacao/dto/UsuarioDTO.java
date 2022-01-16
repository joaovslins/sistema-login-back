package com.autenticacao.dto;

import java.util.Date;

import javax.persistence.Inheritance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Inheritance
@Data
public class UsuarioDTO extends AbstractDTO{
	
	private String usuario;
	
	private String senha;

}
