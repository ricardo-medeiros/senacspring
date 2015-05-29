<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Tarefas</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
	<br/> <br/>
<form action="alteraTarefa" method="post">
	<div style="width: 800px;">
	<table class="table table-bordered">
				<tr>
					<td><input type="hidden" name="id" value="${tarefa.id}"/></td>
				</tr>
				<tr>	
					<td>Descrição:<textarea rows="5" cols="100"  name="descricao" >${tarefa.descricao}</textarea></td> 
					<!-- <input type="text" name="descricao" value="${tarefa.descricao}" /> -->
				</tr>
				<tr>
					<td>
						Finalizado<input type="checkbox" name="finalizado" value="true" ${tarefa.finalizado? 'checked' : ''}/>
					</td>
				</tr>
				<tr>
					<td>
						Data:<input type="text" name="dataFinalizacao" value="<fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy"/>"></input>
					</td>
				</tr>
	</table>
	</div>
	<br/>
	
	<input type="submit" value="Alterar Tarefa"/>
</form>	
</body>
</html>