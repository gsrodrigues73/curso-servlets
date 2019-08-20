package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class ListaEmpresas implements Acao {
	
	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		HttpSession sessao = request.getSession();
//		if(sessao.getAttribute("usuarioLogado") == null) {
//			return "redirect:entrada?acao=LoginForm";
//		}
		
		// Monitoramento Filter
//		long antes = System.currentTimeMillis(); // ajuda a medir tempo de execução
		
		System.out.println("listando empresas");
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		request.setAttribute("empresas", lista);

		// Monitoramento Filter
//		long depois = System.currentTimeMillis(); // ajuda a medir tempo de execução
//		
//		System.out.println("Tempo de execução = " + (depois - antes));
		
		return "foward:listaEmpresas.jsp";
	}

}
