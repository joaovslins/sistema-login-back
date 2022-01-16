package com.autenticacao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.autenticacao.domain.Usuario;
import com.autenticacao.repository.UsuarioRepository;

@Service
public class UsuarioService extends AbstractService<Usuario, UsuarioRepository> implements UserDetailsService{

	public UsuarioService(@Autowired UsuarioRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = repository.findByUsuario(username);
		System.out.println("teste");
		if (user == null) {
			throw new UsernameNotFoundException("User not found");
		} else {
//			authorities[0] = user.getProfile().toString();
			return new User(user.getUsuario(), user.getSenha(), AuthorityUtils.createAuthorityList());
		}
	}

}
