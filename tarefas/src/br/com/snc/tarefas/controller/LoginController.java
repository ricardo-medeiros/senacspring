package br.com.snc.tarefas.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.snc.tarefas.dao.JdbcUsuarioDao;
import br.com.snc.tarefas.modelo.Usuario;

@Controller
public class LoginController {
	
	@RequestMapping("loginForm")
	public String loginForm()
	{
		return "form-login";
	}
	
	@RequestMapping("efetuarLogin")
	public String efetuaLogin(Usuario usuario,HttpSession session)
	{
		if (new JdbcUsuarioDao().existeUsuario(usuario)){
			session.setAttribute("usuarioLogado", usuario);
			return "menu";
		}
		return "redirect:loginForm";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "redirect:loginForm";
	}
}
