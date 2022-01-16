package com.autenticacao.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autenticacao.converter.UsuarioConverter;
import com.autenticacao.domain.Usuario;
import com.autenticacao.dto.UsuarioDTO;
import com.autenticacao.repository.UsuarioRepository;
import com.autenticacao.service.UsuarioService;

@RestController
@RequestMapping(value = "api/login")
@CrossOrigin(exposedHeaders = "authentication")
public class UsuarioController extends AbstractController<Usuario, UsuarioDTO, UsuarioRepository ,UsuarioService, UsuarioConverter> {

	public UsuarioController(UsuarioService service, UsuarioConverter converter) {
		super(service, converter);
		// TODO Auto-generated constructor stub
	}

}
