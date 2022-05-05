package repeticoes;

import java.util.Scanner;

public class maiorMedia {
	/*DO-WHILE
	 * Maior e Média: Faça um programa que leia 5 números e informe o maior número e
	 * a média desses números.
	 */
	public static void calculaMedia() {
		Scanner scan = new Scanner(System.in);
		int cont = 0, num, maior = 0, soma=0, media;

		do {
			System.out.println("Digite um numero:");
			num = scan.nextInt();
			
			soma = soma + num;
			
			if(maior < num)	maior = num;

			cont++;

		} while (cont < 5);
		
		media = soma/5;
		
		System.out.println("Vezes: "+cont);
		System.out.println("A media é: "+media);
		System.out.println("O maior número foi: "+maior);
	}
}
