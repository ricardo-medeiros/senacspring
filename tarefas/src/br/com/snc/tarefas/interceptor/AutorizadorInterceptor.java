package br.com.snc.tarefas.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class AutorizadorInterceptor extends HandlerInterceptorAdapter{

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object controller) throws Exception
	{
		String uri = request.getRequestURI();
		if (uri.endsWith("loginForm") || uri.endsWith("efetuarLogin"))
		{
			return true;
		}
		if (request.getSession().getAttribute("usuarioLogado") != null)
		{
			return true;
		}
		response.sendRedirect("loginForm");
		
		
//		if( request.getSession().getAttribute("usuarioLogado") != null ){
//		
//			if ( uri.endsWith("loginForm") || uri.endsWith("efetuarLogin")){
//				response.sendRedirect("novaTarefa");
//			}
//			
//			return true;
//		}
//		
//		if (uri.endsWith("loginForm") || uri.endsWith("efetuarLogin")){
//			return true;
//		}
		
		return false;
	}
}
