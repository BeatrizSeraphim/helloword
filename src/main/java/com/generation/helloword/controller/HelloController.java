package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "<b>Hello Turma 62!</b>";
	}
	
	@GetMapping("/nome")
	public String meuNome() {
		return "<b>Hello <br />Beatriz</b>";
	}
	
	@GetMapping("/helloword")
	public String helloWord() {
		return "<b>Hello Word!</b>";
	}
	
	@GetMapping("/bsm")
	public String bsmGen() {
		return "<b>Lista de BSM´S da Generation Brasil: <br />Responsabilidade Pessoal "
				+ "<br />Mentalidade de crescimento <br /> "
				+ "Orientação ao futuro <br />"
				+ "Persistência <br /> Comunicação <br />"
				+ " Orientação aos Detalhes <br /> "
				+ "Trabalho em equipe <br /> Proatividade</b>";
	}
	
	@GetMapping("/objetivo")
	public String meusObjetivos() {
		return "<b>Objetivos da semana: <br />Comunicação</br /> Trabalho em equipe<br /> Persistência </b>";
	}
	
}
