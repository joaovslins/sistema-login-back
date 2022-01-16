package com.autenticacao.domain;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Usuario extends AbstractEntity{
	
	private String usuario;
	
	private String senha;

}
