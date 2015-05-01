package br.com.snc.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.snc.tarefas.dao.JdbcTarefaDao;
import br.com.snc.tarefas.modelo.Tarefa;

@Controller
public class TarefasController {
	
	@RequestMapping("novaTarefa")
	public String execute()
	{		
		return "tarefa/formulario";
	}

	@RequestMapping("adicionaTarefa")
	
	public String adiciona(Tarefa tarefa)
	{
		JdbcTarefaDao tarefaDao = new JdbcTarefaDao();
		tarefaDao.adiciona(tarefa);
		return "tarefa/adicionada";
	}
	
}
