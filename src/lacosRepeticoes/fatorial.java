package lacosRepeticoes;

import java.util.Scanner;

public class fatorial {
	public static void fatorialInteiro() {
		/*
		 * FOR Fatorial: Faça um programa que calcule o fatorial de um número inteiro
		 * fornecido pelo usuário.
		 */
		Scanner lerTecla = new Scanner(System.in);

		int num, fatorial;

		System.out.println("Digite o numero que deseja obter fatorial:");
		num = lerTecla.nextInt();

		fatorial = 1;
		
		System.out.print(num+"! = ");
		for (int i = num; i > 0; i--) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
		
	}
}
