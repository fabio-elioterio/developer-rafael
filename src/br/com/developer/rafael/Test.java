package br.com.developer.rafael;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int np;
		int ns;

		System.out.println("Digite um n�mero:");
		np = teclado.nextInt();
		System.out.println("Digite outro n�mero:");
		ns = teclado.nextInt();

		int soma = np + ns;

		System.out.printf("A soma desses n�meros �: %d", soma);

		if (np < ns) {
			System.out.println("\nO n�mero menor � " + np);
		} else {
			System.out.println("\nO n�mero menor � " + ns);
		}
	}

}
