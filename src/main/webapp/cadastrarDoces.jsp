<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.elo7.servlet.NovoDoce" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doceria Sensação</title>
</head>
<body>
	<form action="novoDoce" method="post">
		Nome do Doce: <input type="text" name="nome">
		Ingredientes: <input type="text" name="ingredientes">
		<input type="submit"/>
	</form>
	
</body>
</html>