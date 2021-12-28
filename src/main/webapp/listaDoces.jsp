<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.elo7.servlet.ListaDoces"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cardápio de Doces</title>
</head>
<body>
	<ul>
		<c:forEach items="${doces}" var="doce">
			<li>
				<b>${doce.nome}</b> 
				<a href="trazUmDoce?id=${doce.id}">Atualizar</a>
				<a href="excluirDoce?id=${doce.id}">Excluir</a> <br/>
				 ${doce.ingredientes}
			</li>
			<a href="cadastrarDoces.jsp">Cadastrar novo doce</a>
		</c:forEach>
	</ul>	
</body>
</html>