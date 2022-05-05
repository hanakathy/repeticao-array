package repeticoes;

import java.util.Scanner;

public class Notas {
	/* WHILE
	 * Nota: Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma
	 * mensagem caso o valor seja inv�lido e continue pedindo at� que o usu�rio
	 * informe um valor v�lido.
	 */
	public static void validaNota() {
		Scanner scan = new Scanner(System.in);
		int nota;
		
		System.out.println("Digite uma nota entre 0-10:");
		nota = scan.nextInt();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Nota Inv�lida!");
			nota = scan.nextInt();			
		}
	}
}
