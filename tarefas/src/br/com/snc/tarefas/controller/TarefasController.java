package br.com.snc.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.snc.tarefas.dao.JdbcTarefaDao;
import br.com.snc.tarefas.modelo.Tarefa;

@Controller
public class TarefasController {

	@RequestMapping("novaTarefa")
	public String execute(){
		return "tarefa/formulario";
	}
	
	@RequestMapping("adicionaTarefa")
	public String adiciona(Tarefa tarefa){
		JdbcTarefaDao dao = new JdbcTarefaDao();
		dao.adiciona(tarefa);
		return "tarefa/adicionada";
	}
	
	@RequestMapping("listaTarefas")
	public String lista(Model model)
	{
		JdbcTarefaDao dao = new JdbcTarefaDao();
		model.addAttribute("tarefas",dao.lista());
		
		return "tarefa/lista";
	}
	
	@RequestMapping("removeTarefas")
	public String remove(Tarefa tarefa)
	{
		JdbcTarefaDao dao = new JdbcTarefaDao();
		dao.remove(tarefa);
		
		return "redirect:listaTarefas";
	}
	
	@RequestMapping("alteraTarefa")
	public String altera(Tarefa tarefa){
		JdbcTarefaDao dao = new JdbcTarefaDao();
		dao.altera(tarefa);
		return "redirect:listaTarefas";
	}
	
	@RequestMapping("editarTarefas")
	public String editar(Tarefa tarefa,Model model){
		JdbcTarefaDao dao = new JdbcTarefaDao();
		Tarefa tar = dao.buscaPorId(tarefa.getId());
		model.addAttribute("tarefa",tar);
		return "tarefa/alterar";
	}
	
}
