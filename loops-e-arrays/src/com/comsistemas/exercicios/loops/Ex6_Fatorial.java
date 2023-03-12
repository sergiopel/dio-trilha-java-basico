package com.comsistemas.exercicios.loops;

import java.util.Scanner;

/*
Utilizar o laço FOR
Fatorial: Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/
public class Ex6_Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		String fatorialTexto;
		int fatorialResultado;
		
		System.out.println("Fatorial do número: ");
		numero = scan.nextInt();
		
		fatorialResultado = 1;
		System.out.print(numero + "! = ");
		
		for (int i = numero; i > 0; i--) {
			fatorialResultado *= i; 
		}
		
		System.out.println(fatorialResultado);
	}

}
