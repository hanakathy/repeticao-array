package arrays;

import java.util.Random;
import java.util.Scanner;

public class vetorNumeros {
	public static void numerosAleatorios() {
		/* ARRAY UNIDIMENSIONAL
		 * Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios
		 * (entre 0 e 100) armazene-os num vetor. Ao final, mostre os números e seus
		 * sucessores.
		 */
		
		int CONT = 20; //para testar com numeros menores
		
		Random aleatorio = new Random();	
		int[] num = new int[CONT];
		int i, numero;
		
		for (i=0; i<num.length; i++) {
			numero = aleatorio.nextInt(100);
			num[i] = numero;
		}
		
		System.out.println("E os numeros sorteados foram:");
		for (int j : num) {
			System.out.print(j+" ");
		}
		
		System.out.println("\nOs sucessores:");
		for (int numERO : num) {
			System.out.print((numERO+1)+" ");
		}
		
	}
}
