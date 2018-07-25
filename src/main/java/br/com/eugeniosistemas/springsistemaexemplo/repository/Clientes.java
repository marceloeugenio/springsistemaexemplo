package br.com.eugeniosistemas.springsistemaexemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eugeniosistemas.springsistemaexemplo.model.Cliente;

@Repository
public interface Clientes extends JpaRepository<Cliente, Long>{

}
