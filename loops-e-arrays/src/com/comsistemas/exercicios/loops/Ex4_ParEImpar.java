package com.comsistemas.exercicios.loops;

import java.util.Scanner;

/* Utilizar DO-WHILE 
 *  Faça um programa que peça N números inteiros.
 *  Calcule e mostre a quantidade de números pares e a
 *  quantidade de números impares.
 */

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantidadeNumeros;
		int numero;
		int contador = 0;
		int quantidadePares = 0, quantidadeImpares = 0;
		
		System.out.println("Quantos números inteiros? ");
		quantidadeNumeros = scan.nextInt();
		
		do {
			System.out.println("Informe o número");
			numero = scan.nextInt();
			numero %= 2;
			if(numero > 0) quantidadeImpares++;
			else quantidadePares++;
			contador++;
		} while (contador < quantidadeNumeros);
		
		System.out.println("Quantidade de número pares: " + quantidadePares);
		System.out.println("Quantidade de número ímpares: " + quantidadeImpares);
	
	}

}
