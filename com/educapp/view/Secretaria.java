package com.educapp.view;

import java.util.Scanner;
import com.educapp.model.Curso;

public class Secretaria {

	private Scanner input;

	public Secretaria() {
		this.input = new Scanner(System.in);
	}

	public int menuPrincipal() {

		System.out.println("╔════════════════════════════════╗");
		System.out.println("║     BEM VINDO À CURSOS JAVA    ║");
		System.out.println("╠════════════════════════════════╣");
		System.out.println("║ 1. Cadastrar curso             ║");
		System.out.println("║ 2. Listar todos os cursos      ║");
		System.out.println("║ 3. Remover curso pelo nome     ║");
		System.out.println("║ 4. Buscar curso pelo nome      ║");
		System.out.println("║ 5. Editar dados do curso       ║");
		System.out.println("║ 6. Mostrar total de cursos     ║");
		System.out.println("║ 7. Sair do sistema             ║");
		System.out.println("╚════════════════════════════════╝");
		System.out.print("Digite a opção desejada: ");

		return input.nextInt();
	}

	public Curso cadastrarCurso() {

		input.nextLine();
		
		System.out.println("╔══════════════════════════════════╗");
		System.out.println("║          CADASTRAR CURSO         ║");
		System.out.println("╠══════════════════════════════════╣");
		System.out.print("║ Nome do curso: ");
		String nome = input.nextLine();
		System.out.print("║ Duração (horas): ");
		int horas = input.nextInt();
		input.nextLine();
		System.out.print("║ Nível do curso: ");
		String nivel = input.nextLine();
		System.out.print("║ Número de vagas: ");
		int vagas = input.nextInt();
		System.out.println("╚══════════════════════════════════╝");
		
		System.out.println("╔══════════════════════════════════╗");
		System.out.println("║  CURSO CADASTRADO COM SUCESSO!!  ║");
		System.out.println("╚══════════════════════════════════╝");
		
		Curso curso = new Curso(nome, horas, nivel, vagas);
		
		return curso;
	}
	
	public void listar() {
		
		System.out.println("\n╔══════════════════════════════════╗");
		System.out.println("║       CURSOS DISPONÍVEIS:        ║");
		System.out.println("╚══════════════════════════════════╝");
		
		
	}
	
	public void listarCurso ( Curso c, int cont ) {
		
		System.out.println("╔══════════════════════════════════╗");
		System.out.println("║"  + cont + ": " + c.getNome() +"  ");
		System.out.println("╚══════════════════════════════════╝");	
		
		
	}
	
	public String excluirCurso() {
		
		System.out.println("\n╔════════════════════════════════╗");
		System.out.println("║       EXCLUIR CURSO:           ║");
		System.out.println("╠════════════════════════════════╣");
		System.out.print("║ Insira o Nome do Curso:        ");
		input.nextLine();
		System.out.println("\n╚════════════════════════════════╝");
		
		return input.nextLine();
	}
	
	public String pesquisarCurso() {
		
		System.out.println("\n╔════════════════════════════════╗");
		System.out.println("║       PESQUISAR CURSO:         ║");
		System.out.println("╠════════════════════════════════╣");
		System.out.print("║ Insira o Nome do Curso:        ");
		input.nextLine();
		System.out.println("\n╚════════════════════════════════╝");
		
		return input.nextLine();
		
	}
	
	
	public String escolhaEditar() {
		
		System.out.println("\n╔════════════════════════════════╗");
		System.out.println("║       EDITAR CURSO:         ║");
		System.out.println("╠════════════════════════════════╣");
		System.out.print("║ Insira o Nome do Curso:        ");
		input.nextLine();
		System.out.println("\n╚════════════════════════════════╝");	
		
		return input.nextLine();
	
	}
	
	
	public int escolhaEditarAtributo() {
		
		System.out.println("╔════════════════════════════════╗");
		System.out.println("║      O QUE DESEJA EDITAR       ║");
		System.out.println("╠════════════════════════════════╣");
		System.out.println("║ 1. Nome                        ║");
		System.out.println("║ 2. Duração de Horas            ║");
		System.out.println("║ 3. Nível                       ║");
		System.out.println("║ 4. Vagas                       ║");
		System.out.println("╚════════════════════════════════╝");
		return input.nextInt();
	}
	
	public String editarNome() {
		

		System.out.println("\n╔════════════════════════════════╗");
		System.out.println("║      EDITAR NOME DO CURSO      ║");
		System.out.println("╠════════════════════════════════╣");
		System.out.print("║ Insira o Nome do Curso:        ");
		input.nextLine();
		System.out.println("\n╚════════════════════════════════╝");	
		
		return input.nextLine();
		
		
	}
	
	public int editarDuracao() {

		System.out.println("\n╔════════════════════════════════╗");
		System.out.println("║    EDITAR DURAÇÂO DO CURSO     ║");
		System.out.println("╠════════════════════════════════╣");
		System.out.print("║ Insira a duração do Curso:        ");
		input.nextLine();
		System.out.println("\n╚════════════════════════════════╝");	
		
		return input.nextInt();
		
	}
	
	public String editarNivel() {
		

		System.out.println("\n╔════════════════════════════════╗");
		System.out.println("║     EDITAR NÍVEL DO CURSO:       ║");
		System.out.println("╠════════════════════════════════╣");
		System.out.print("║ Insira o Nível do Curso:        ");
		input.nextLine();
		System.out.println("\n╚════════════════════════════════╝");	
		
		return input.nextLine();
	}
	
	public int editarVagas() {

		System.out.println("\n╔════════════════════════════════╗");
		System.out.println("║     EDITAR VAGAS DO CURSO:     ║");
		System.out.println("╠════════════════════════════════╣");
		System.out.print("║ Insira as vagas do Curso:        ");
		input.nextLine();
		System.out.println("\n╚════════════════════════════════╝");	
		
		return input.nextInt();
	}
}
