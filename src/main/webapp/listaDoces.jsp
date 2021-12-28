<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.elo7.servlet.ListaDoces"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cardápio de Doces</title>
</head>
<body>

	<c:if test="${not empty doce}">
		Doce ${ empresa } cadastrado com sucesso!
	</c:if>
	
	Doces: <br/>
	
	<ul>
		<c:forEach items="${doces}" var="doce">
			
			<li>
				<b>${doce.nome}</b>> <br/> ${doce.ingredientes}
				<a href="atualizarEmpresa?id=${doce.id }">Atualizar</a>
				<a href="excluirEmpresa?id=${doce.id }">Excluir</a>
			</li>
		</c:forEach>
	</ul>
	
</body>
</html>