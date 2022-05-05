package lacosRepeticoes;

import java.util.Scanner;

public class nomeEIdade {
	/* WHILE
	 * Nome e Idade: Faça um programa que leia conjuntos de dois valores, o primeiro
	 * representando o nome do aluno e o segundo representando a sua idade. (Pare o
	 * programa inserindo o valor 0 no campo nome)
	 */
	public static void lerNomeIdade() {
		Scanner ler = new Scanner(System.in);
		String nome;
		int idade;

		while (true) {
			System.out.println("Nome:");
			nome = ler.next();
			
			if (nome.equals("0")) break;
			
			System.out.println("Idade:");
			idade = ler.nextInt();
		}
	}
}
