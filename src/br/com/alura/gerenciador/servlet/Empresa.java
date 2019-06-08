package br.com.alura.gerenciador.servlet;

import java.util.Date;

public class Empresa {
	
	private static int ultimoId = 0;
	
	private Integer id;
	private String nome;
	private Date dataAbertura;
	
	public Empresa() {
		this.id = ++ultimoId;
		this.dataAbertura = new Date();
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
}
