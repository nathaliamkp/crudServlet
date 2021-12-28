package br.com.elo7.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.elo7.modelo.*;

import br.com.elo7.dao.*;


@WebServlet("/novoDoce")
public class NovoDoce extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		String nomeDoDoce = request.getParameter("nome");
		String ingredientes = request.getParameter("ingredientes");
		
		Doce doce = new Doce(nomeDoDoce, ingredientes);
		
		banco.adiciona(doce);
		
		request.setAttribute("nomeDoDoce", doce.getNome());
		request.setAttribute("ingredientes", doce.getIngredientes());
		
		RequestDispatcher rd = request.getRequestDispatcher("/doceNovoNoCardapio.jsp");
		rd.forward(request, response);
		
		
	}



}
