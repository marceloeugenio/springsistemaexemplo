package br.com.eugeniosistemas.springsistemaexemplo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.eugeniosistemas.springsistemaexemplo.service.CadastroClienteService;

@Configuration
@ComponentScan(basePackageClasses = CadastroClienteService.class)
public class ServiceConfig {

}
