package br.com.eugeniosistemas.springsistemaexemplo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.eugeniosistemas.springsistemaexemplo.model.Cliente;
import br.com.eugeniosistemas.springsistemaexemplo.repository.Clientes;

@Service
public class CadastroClienteService {
	
	@Autowired
	private Clientes clientes;
	
	@Transactional
	public void salvar(Cliente cliente) {
		clientes.save(cliente);
	}
}