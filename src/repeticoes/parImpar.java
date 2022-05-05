package repeticoes;

import java.util.Scanner;

public class parImpar {
	public static void verificaNum() {
		/*
		 * DO-WHILE Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e
		 * mostre a quantidade de números pares e a quantidade de números impares.
		 */
		Scanner ler = new Scanner(System.in);
		int num, parar = 1;
		int par = 0, impar = 0;

		do {
			System.out.println("Numero:");
			num = ler.nextInt();
			if (num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			
			System.out.println("");
			System.out.println("Deseja parar? \n0-sim | 1-não");
			parar = ler.nextInt();
		} while (parar == 1);

		System.out.println("Pares: " + par);
		System.out.println("Impares: " + impar);

	}
}
