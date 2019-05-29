package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List <Empresa> listaEmpresa = new ArrayList<>();
	
	public void adiciona(Empresa empresa) {
		listaEmpresa.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.listaEmpresa;
	}
	
}
