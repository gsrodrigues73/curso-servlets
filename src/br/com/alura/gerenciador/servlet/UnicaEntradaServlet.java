package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.EditaEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresaForm;
import br.com.alura.gerenciador.acao.RemovaEmpresa;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
		String nome = null;
		
		if(paramAcao.equals("ListaEmpresas")) {
			ListaEmpresas acao = new ListaEmpresas();
			nome = acao.executa(request, response);
		} else if(paramAcao.equals("RemovaEmpresa")) {
			RemovaEmpresa acao = new RemovaEmpresa();
			nome = acao.executa(request, response);
		} else if(paramAcao.equals("MostraEmpresa")) {
			MostraEmpresa acao = new MostraEmpresa();
			nome = acao.executa(request, response);
		} else if(paramAcao.equals("EditaEmpresa")) {
			EditaEmpresa acao = new EditaEmpresa();
			nome = acao.executa(request, response);
		} else if(paramAcao.equals("NovaEmpresa")) {
			NovaEmpresa acao = new NovaEmpresa();
			nome = acao.executa(request, response);
		} else if(paramAcao.equals("NovaEmpresaForm")) {
			NovaEmpresaForm acao = new NovaEmpresaForm();
			nome = acao.executa(request, response);
		}
		
		String[] tipoEndereco = nome.split(":");
		
		if(tipoEndereco[0].equals("foward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/" + tipoEndereco[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipoEndereco[1]);
		}
	}
}
