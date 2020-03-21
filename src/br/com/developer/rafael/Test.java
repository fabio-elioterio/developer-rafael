package br.com.developer.rafael;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int np;
		int ns;

		System.out.println("Digite um número:");
		np = teclado.nextInt();
		System.out.println("Digite outro número:");
		ns = teclado.nextInt();

		int soma = np + ns;

		System.out.printf("A soma desses números é: %d", soma);

		if (np < ns) {
			System.out.println("\nO número menor é " + np);
		} else {
			System.out.println("\nO número menor é " + ns);
		}
	}

}
