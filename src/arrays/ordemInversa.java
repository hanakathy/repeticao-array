package arrays;

import java.util.Scanner;

public class ordemInversa {
	public static void arrayRevertido() {
		/* ARRAY UNIDIMENSIONAL
		 * Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e
		 * mostre-os na ordem inversa.
		 */
		
		int i;
		int[] numInt = new int[5]; //declarando arrays
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.println("Digite os valores do vetor: ");
		
		for (i=0; i<numInt.length; i++) {
			numInt[i] = lerTeclado.nextInt();
		}
		
		
		for (i=(numInt.length-1); i>=0; i--) {
			System.out.print("["+numInt[i]+"] ");
		}
	}
}
