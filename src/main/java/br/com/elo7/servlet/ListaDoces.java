package br.com.elo7.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.elo7.dao.Banco;


@WebServlet("/listaDoces")
public class ListaDoces extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		Banco banco = new Banco();
		
		request.setAttribute("doces", banco.getDoces());
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaDoces.jsp");
		rd.forward(request, response);
		
		
	}

}




//<br> ${doce.ingredientes}
//<a href="/crud/atualizarDoce">Atualizar</a>
//<a href="/crud/excluirDoce">Excluir</a>