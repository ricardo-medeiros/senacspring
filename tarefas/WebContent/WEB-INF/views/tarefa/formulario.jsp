<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nova Tarefa</title>
</head>
<body>
	<h3>Adicionar tarefas</h3>
	<form action="adicionaTarefa" method="post">
      Descrição: <br />
      <textarea name="descricao" rows="5" cols="100"></textarea><br />
      
      <input type="submit" value="Adicionar">
    </form>
</body>
</html>