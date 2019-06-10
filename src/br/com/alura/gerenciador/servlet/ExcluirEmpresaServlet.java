package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

@WebServlet("/excluirEmpresa")
public class ExcluirEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idEmpresa = request.getParameter("id");
		
		Banco banco = new Banco();
		banco.retiraId(Integer.parseInt(idEmpresa));
		
		response.sendRedirect("listaEmpresas");

	}

}
