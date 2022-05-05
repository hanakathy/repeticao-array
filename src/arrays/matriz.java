package arrays;

import java.util.Random;

public class matriz {
	public static void menorNumero() {
		/*
		 * ARRAY MULTIDIMENSIONAL Array Multidimensional: Gere e imprima uma matriz M
		 * 4x4 com valores aleatórios entre 0-9. Após isso determine o menor número da
		 * matriz e a sua posição(linha, coluna).
		 */
		int cont = 2;
		Random aleatorio = new Random();
		int[][] M = new int[cont][cont];
		int i, j, menor = 0;

		for (i = 0; i < M.length; i++) {
			for (j = 0; j < M.length; j++) {
				M[i][j] = aleatorio.nextInt(9);
			}
		}
		menor = M[0][0];

		for ( int[] linha : M) {
			for (int coluna: linha) {
				if (menor > coluna) {
					menor = coluna;
				}
				System.out.print(coluna + " ");
			}
			System.out.println();
		}

		System.out.println("O menor numero é: " + menor);

	}
}
