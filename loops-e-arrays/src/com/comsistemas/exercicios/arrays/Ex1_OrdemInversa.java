package com.comsistemas.exercicios.arrays;

// Array Unidimensional = 1 linha e 1 coluna
// Todo vetor tem que ser do mesmo tipo e sempre inicia pelo posição 0
/* Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros
 * e mostre-os na ordem inversa
 */
public class Ex1_OrdemInversa {

	public static void main(String[] args) {
		int[] vetor = {-5, -6, 15, 50, 8};
		
		int count = 0;
		
		System.out.print("Vetor: ");
		
		//length - tamanho do vetor que é 5, porém começa da posição 0
		while(count < vetor.length) {
			System.out.print(vetor[count] + " ");
			count++;
		}
		
		System.out.print("\nVetor: ");
		for(int i = vetor.length - 1; i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
		
	}

}
