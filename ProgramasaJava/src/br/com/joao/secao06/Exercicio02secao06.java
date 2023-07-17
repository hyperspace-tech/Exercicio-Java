package br.com.joao.secao06;

import java.util.Scanner;

public class Exercicio02secao06 {

	public static void main(String[] args) {
		int numero;
		int a;
		int b;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		numero = teclado.nextInt();
		
		if (numero > 0) {
			a = numero;
			System.out.println(a);
		}else {
			b = numero;
			System.out.println(b);
				
			teclado.close();
		}
	}

}
