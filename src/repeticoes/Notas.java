package repeticoes;

import java.util.Scanner;

public class Notas {
	/* WHILE
	 * Nota: Faça um programa que peça uma nota, entre zero e dez. Mostre uma
	 * mensagem caso o valor seja inválido e continue pedindo até que o usuário
	 * informe um valor válido.
	 */
	public static void validaNota() {
		Scanner scan = new Scanner(System.in);
		int nota;
		
		System.out.println("Digite uma nota entre 0-10:");
		nota = scan.nextInt();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Nota Inválida!");
			nota = scan.nextInt();			
		}
	}
}
