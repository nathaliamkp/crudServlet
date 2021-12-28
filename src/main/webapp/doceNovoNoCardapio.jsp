<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.elo7.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doce cadastrado com sucesso</title>
</head>
<body>
	<h2>${nomeDoDoce} agora faz parte do cardápio de doces.</h2>
	<div> Ingredientes: ${ingredientes}.</div>
	<a href="cadastrarDoces.jsp">Cadastrar novo doce</a>
	<a href="listaDoces.jsp">Cardapio de doces completo</a>
</body>
</html>