<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
	<body>
		<center><h2>Login Tarefas</h2>
		<form action="efetuarLogin" method="post">
		<div style="width: 300px;">
		<table class="table table">
		  <tr>
		  <td>
			Login:</td><td> <input type="text" name="login" />
		  </td>	
		  </tr>
		  <tr>
			<td>Senha:</td><td> <input type="password" name="senha" /> </td>
		  </tr>
		  <tr>
			<td align="center" colspan="2"> <input type="submit" value="Login Tarefas" /></td>
		  </tr>
		  </table>
		  </div>	
		</form></center>
	</body>
</html>