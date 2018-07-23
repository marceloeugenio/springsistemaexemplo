package br.com.eugeniosistemas.springsistemaexemplo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ClientesController {
	
	@RequestMapping("/clientes/novo")
	public String novo(Model model, RedirectAttributes attributes) {
		model.addAttribute("mensagem", "meu primeiro sistema com Framework Spring!");
		return "cliente/CadastroCliente";
	}

	@RequestMapping("/clientes/cadastro")
	public String cadastro() {
		return "cliente/cadastro-cliente";
	}
}
