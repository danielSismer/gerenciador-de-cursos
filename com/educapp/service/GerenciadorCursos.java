package com.educapp.service;

import com.educapp.model.*;
import com.educapp.view.*;
import java.util.List;
import java.util.ArrayList;

public class GerenciadorCursos {

	private List<Curso> cursos;

	public GerenciadorCursos() {
		this.cursos = new ArrayList<>();
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public void gerenciarCurso(int opcao, Secretaria secretaria, Curso curso, boolean continuar) {

		switch (opcao) {

		case 1 -> { curso = secretaria.cadastrarCurso(); cursos.add(curso); }
		
		case 2 -> { int cont = 1; secretaria.listar(); for ( Curso c : cursos) { secretaria.listarCurso(c, cont++);} }
		
		case 3 -> {
			
			String nomeExcluir = secretaria.excluirCurso();
			
			for ( int cont = 0; cont < cursos.size(); cont++) {
				if (cursos.get(cont).getNome().equalsIgnoreCase(nomeExcluir)) { cursos.remove(cont); }
				
			}
			
		}
		
		case 4 -> {
			
			String nomePesquisar = secretaria.pesquisarCurso();
			

			for ( int cont = 0; cont < cursos.size(); cont++) {
				if (cursos.get(cont).getNome().equalsIgnoreCase(nomePesquisar)) { System.out.println(cursos.get(cont)); }
				
			}
			
			
		}
		
		case 5 -> {
			
			String cursoEditar = secretaria.escolhaEditar();
			
			int atributo = secretaria.escolhaEditarAtributo();
			
			for ( int cont = 0; cont < cursos.size(); cont++) {
				
				if (cursos.get(cont).getNome().equalsIgnoreCase(cursoEditar)) {
					
					if (atributo == 1){
						
						String nome = secretaria.editarNome();
						
						cursos.get(cont).setNivel(nome);
						
					}
					
					else if ( atributo == 2) {
						
						int duracao = secretaria.editarDuracao();
						
						cursos.get(duracao).setDuracaoHoras(duracao);
					}
					
					else if (atributo == 3 ) {
						
						String nivel = secretaria.editarNivel();
						
						cursos.get(cont).setNivel(nivel);
							
					}
					
					else if (atributo == 4 ) {
						
						int vagas = secretaria.editarVagas();
						
						cursos.get(vagas).setVagas(vagas);
					}
					
				}
				
			}
			
		}
		
		}
	}

}
