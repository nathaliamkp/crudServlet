<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.elo7.servlet.AtualizarDoce" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Atualiza Doce</title>
</head>
<body>
	<form action="atualizarDoce" method="post">
		Nome: <input type="text" name="nome" value="${doce.nome}" />
		Ingredientes: <input type="text" name="ingredientes"  value="${doce.ingredientes}"/>
		<input type="hidden" name="id" value="${doce.id}">
		<input type="submit" />
	</form>
</body>
</html>