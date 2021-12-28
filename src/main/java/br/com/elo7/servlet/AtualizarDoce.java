package br.com.elo7.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.elo7.dao.Banco;
import br.com.elo7.modelo.Doce;

@WebServlet("/atualizarDoce")
public class AtualizarDoce extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeDoDoce = request.getParameter("nome");
		String ingredientesDoce = request.getParameter("ingredientes");
		String doceId = request.getParameter("id");
		Integer id = Integer.valueOf(doceId);
		
		
		
		Banco banco = new Banco();
		Doce doce = banco.buscaDocePorId(id);
		doce.setNome(nomeDoDoce);
		doce.setIngredientes(ingredientesDoce);
		
		response.sendRedirect("listaDoces");
	
	}

}
