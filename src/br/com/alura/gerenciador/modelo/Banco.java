package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List <Empresa> listaEmpresa = new ArrayList<>();
	private static List <Usuario> listaUsuario = new ArrayList<>();
	
	static {
		Empresa empresa1 = new Empresa();
		Empresa empresa2 = new Empresa();
		
		empresa1.setNome("Alura");
		empresa2.setNome("Caelum");
		
		listaEmpresa.add(empresa1);
		listaEmpresa.add(empresa2);
		
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		
		usuario1.setLogin("beto");
		usuario1.setSenha("1234");
		usuario2.setLogin("luciano");
		usuario2.setSenha("1234");
		
		listaUsuario.add(usuario1);
		listaUsuario.add(usuario2);
	}
	
	public void adiciona(Empresa empresa) {
		listaEmpresa.add(empresa);
	}
	
	public void retiraId(int id) {
		for (Empresa e : listaEmpresa) {
			if(e.getId() == id) {
				System.out.println("encontrei o Id " + id + ", e exclui a empresa " + e.getNome());
				listaEmpresa.remove(e);
				return;
			}
		}
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.listaEmpresa;
	}

	public Empresa getEmpresaId(int id) {
		for (Empresa e : listaEmpresa) {
			if(e.getId() == id) {
				System.out.println("encontrei o Id " + id + ", e retornei a empresa " + e.getNome());
				return e;
			}
		}
		return null;
	}

	public void updateEmpresa(Empresa novaEmpresa) {
		for (Empresa e : listaEmpresa) {
			if(e.getId() == novaEmpresa.getId()) {
				System.out.println("encontrei o Id " + novaEmpresa.getId() + ", e alterei a empresa " + novaEmpresa.getNome());
				e.setNome(novaEmpresa.getNome());
				e.setDataAbertura(novaEmpresa.getDataAbertura());
				return;
			}
		}
	}

	public Usuario existeUsuario(String login, String senha) {
		for (Usuario usuario : listaUsuario) {
			if(usuario.ehIgual(login, senha))
				return usuario;
		}
		return null;
	}

}
