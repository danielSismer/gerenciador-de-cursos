package com.educapp.model;

public class Curso {
	
	private String nome;
	private int duracaoHoras;
	private String nivel;
	private int vagas;
	
	public Curso () {
		
		this.duracaoHoras = 0;
		this.nivel = "";
		this.nome = "";
		this.vagas = 0;
		
	}
	
	public Curso(String nome, int duracao, String nivel, int vagas) {
		
		this.duracaoHoras = duracao;
		this.nivel = nivel;
		this.nome = nome;
		this.vagas = vagas;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDuracaoHoras() {
		return duracaoHoras;
	}

	public void setDuracaoHoras(int duracaoHoras) {
		this.duracaoHoras = duracaoHoras;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getVagas() {
		return vagas;
	}
	
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	
	public String toString () {
		
		return "----------------------\nNome: " + nome + "\n---------------------"
				+ "-\nDuração de Horas: " + duracaoHoras + "\n-------------------"
						+ "---\nNível: " + nivel + "\n----------------------\nVagas: " + vagas;
	}

}
