package com.comsistemas.exercicios.arrays;

import java.util.Random;

/*
 * Array Multidimensional: Gere e imprima uma matriz M 4x4 com valores
 * aleatórios entre 0-9. Após isso determine o menor número da matriz
 * e a sua posição(linha, coluna).
 *
 * Ex.:
 * 			col1  col2  col3  col4
 * linha 1   7      3     1     0
 * linha 2	 5      2     7     8
 * linha 3   0      1     2     3
 * linha 4	 8      9     6     3
 */
public class Ex4_ArrayMultidimensional {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[][] M = new int[4][4];
		
		// M.length = 4 linhas
		// M[0].length = 4 colunas
		for(int lin = 0; lin < M.length; lin++) {
			for(int col = 0; col < M[lin].length; col++) {
				M[lin][col] = random.nextInt(9);
			}
		}
		
		System.out.println("Matriz: ");
		// aqui é o foreach, para percorrer a matriz
		for (int[] linha : M) {
			for (int coluna : linha) {
				System.out.print(coluna + " ");
			}
			System.out.println();
		}

	}
}
