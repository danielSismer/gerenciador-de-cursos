package com.educapp;

import com.educapp.model.Curso;
import com.educapp.service.GerenciadorCursos;
import com.educapp.view.Secretaria;

public class Main {

	public static void main(String[] args) {

		Curso curso = new Curso();
		Secretaria secretaria = new Secretaria();
		GerenciadorCursos service = new GerenciadorCursos();
		
		boolean continuar = true;
		
		while(continuar) {
			
			int menu = secretaria.menuPrincipal();
			
			service.gerenciarCurso(menu, secretaria, curso, continuar);
			
		}
		
	

		
	}

}
