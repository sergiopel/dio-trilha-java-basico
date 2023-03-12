package com.comsistemas.exercicios.loops;

import java.util.Scanner;

/*
Utilizar WHILE
Nome e Idade: Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando
a sua idade. (Pare o programa inserindo o valor 0 no campo nome) 
*/
public class Ex1_NomeEIdade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nomeAluno;
		int idadeAluno;

		while (true) {
			System.out.println("Insira o nome do aluno: ");
			nomeAluno = scan.next();
			if(nomeAluno.equals("0")) break;
			System.out.println("Insira a idade do aluno: ");
			idadeAluno = scan.nextInt();
		}

		System.out.println("Terminou...");
		
	}
}
