package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class RemovaEmpresa {
	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idEmpresa = request.getParameter("id");
		
		Banco banco = new Banco();
		banco.retiraId(Integer.parseInt(idEmpresa));
		
		response.sendRedirect("entrada?acao=ListaEmpresas");

	}

}
