package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//@WebFilter("/entrada")
public class MonitoramentoFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("MonitoramentoFilter");
		long antes = System.currentTimeMillis(); // ajuda a medir tempo de execução
		String acao = request.getParameter("acao");
		
		// Continua a execução
		chain.doFilter(request, response);
		
		long depois = System.currentTimeMillis(); // ajuda a medir tempo de execução
		
		System.out.println("Tempo de execução da ação " + acao + " = " + (depois - antes));
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
