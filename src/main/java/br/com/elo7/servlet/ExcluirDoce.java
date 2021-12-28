package br.com.elo7.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.elo7.dao.Banco;

@WebServlet("/excluirDoce")
public class ExcluirDoce extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String doceId = request.getParameter("id");
		Integer id = Integer.valueOf(doceId);
		
		System.out.println(id);
		
		Banco banco = new Banco();
		banco.excluiDoce(id);
		
		response.sendRedirect("listaDoces");
		
	}

	
}
