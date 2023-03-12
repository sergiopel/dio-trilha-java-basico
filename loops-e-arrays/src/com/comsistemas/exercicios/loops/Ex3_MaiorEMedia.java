package com.comsistemas.exercicios.loops;

import java.util.Scanner;

/*
Utilizar DO-WHILE 
Maior e Média: Faça um programa que leia 5 números e informe
o maior número e a média desses números.
*/
public class Ex3_MaiorEMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int quantidade = 0;
		int soma = 0;
		int maiorNumero = 0;
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
			soma += numero;
			quantidade++;
		} while (quantidade < 5);

		System.out.println("Maior número: " + maiorNumero);
		System.out.println("Média: " + (soma/5));
		
	}

}
