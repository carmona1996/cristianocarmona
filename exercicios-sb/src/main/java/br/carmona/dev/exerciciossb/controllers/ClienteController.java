package br.carmona.dev.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.carmona.dev.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping(path="/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Bruninho Esfola Pica", "034.250.950-05");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria","987.654.321-00");
	}
	
	@GetMapping
	public Cliente obterClientePorId2(
			@RequestParam(name = "id") int id) {
		return new Cliente(id, "João Augusto","111.222.333-44");
	}
	
}
