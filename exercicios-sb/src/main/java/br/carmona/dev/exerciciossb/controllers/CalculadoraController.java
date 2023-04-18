package br.carmona.dev.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	@GetMapping("/somar/{a}/{b}")
	public int somar(@PathVariable int a,@PathVariable int b) {
		return a+b;
	}
	@GetMapping("/subtrair")
	public int subtrair(
			@RequestParam(name="b") int a,
			@RequestParam(name="a") int b) {
		return a-b;
	}	

	
}
	
