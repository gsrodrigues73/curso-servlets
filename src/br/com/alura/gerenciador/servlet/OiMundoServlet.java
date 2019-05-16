package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Configurar URL de chamada
@WebServlet(urlPatterns="/oi")
public class OiMundoServlet extends HttpServlet {
	
	private static final long serialVersionUID = -4628190983452256105L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Oi mundo. Parab�ns! Voc� escreveu seu primeiro servlet.</h1>");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("O Servlet OiMundoServlet foi chamado");
	}
}
