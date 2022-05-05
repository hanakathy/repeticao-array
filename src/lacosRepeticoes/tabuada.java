package lacosRepeticoes;

import java.util.Scanner;

public class tabuada {
	public static void multiplicacao() {
		/*
		 * FOR Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
		 * qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero
		 * ele deseja ver a tabuada.
		 */

		Scanner ler = new Scanner(System.in);
		int num;

		System.out.println("Digite o numero que deseja saber a tabuada:");
		num = ler.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}
}
