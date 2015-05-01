package br.com.snc.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TesteController {

	@RequestMapping("/testeSpring")
	public String execute()
	{
		System.out.println("Testando primeira aplicação com Spring!");
		return "ok";
	}
}
