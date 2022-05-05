package arrays;

import java.awt.Container;
import java.nio.channels.NonReadableChannelException;
import java.util.Scanner;

public class consoantes {
	public static void vetorConsoantes() {
		/*
		 * ARRAY UNIDIMENSIONAL Consoantes: Faça um Programa que leia um vetor de 6
		 * caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
		 */
		int cont = 3;

		Scanner ler = new Scanner(System.in);
		String[] vetorLido = new String[cont];
		String[] consoante = new String[cont];
		String letra;
		int contConsoantes = 0, i;

		System.out.println("Digite as letras:");
		for (i = 0; i < vetorLido.length; i++) {
			letra = ler.next();

			vetorLido[i] = letra;

			if (!(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") | letra.equalsIgnoreCase("i")
					| letra.equalsIgnoreCase("o") | letra.equalsIgnoreCase("u"))) {
				consoante[i] = letra;
				contConsoantes++;
			}
		}

		System.out.println("Todas as letras digitadas: ");
		for (i = 0; i < vetorLido.length; i++) {
			System.out.print(vetorLido[i]);
		}
		
		System.out.println("\nConsoantes digitadas: ");
		for (String palavra : consoante) {
			if (palavra != null) {
				System.out.print(palavra);
			}
		}

		System.out.println("\nQuantidade total de consoantes: " + contConsoantes);

	}
}
