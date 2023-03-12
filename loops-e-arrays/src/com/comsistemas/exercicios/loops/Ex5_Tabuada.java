package com.comsistemas.exercicios.loops;

import java.util.Scanner;

/* Utilizar o laço FOR

Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada
de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Ex5_Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int tabuadaNumero;
		
		System.out.println("Gerar a tabuada de qual número ? ");
		tabuadaNumero = scan.nextInt();
		
		System.out.println("Tabuada de " + tabuadaNumero + ":");
		
		//começando i = 1, enquanto i<=10 executar, ao final de cada laço incrementar 1
		for (int i = 1; i <= 10; i++) {
			System.out.println(tabuadaNumero + " X " + i + " = " + (tabuadaNumero * i));
		}
		
	}

}
