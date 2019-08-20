package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class MostraEmpresa implements Acao {
	
	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idEmpresa = request.getParameter("id");

		Banco banco = new Banco();
		Empresa empresa = banco.getEmpresaId(Integer.parseInt(idEmpresa));
		
		request.setAttribute("idEmpresa", idEmpresa);
		request.setAttribute("empresa", empresa);
		
		return "foward:formEditaEmpresa.jsp";
	}

}