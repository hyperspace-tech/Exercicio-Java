package br.com.joao.secao06;

import java.util.Scanner;

public class Exercicio03secao06 {

	public static void main(String[] args) {
		int numero;
		int p = 0;
		int i = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe um numero: ");
		numero = teclado.nextInt();
		
		if(numero % 2 == 0 ) {
			p = numero;	
		}else {
			i = numero;
		}
			System.out.println(p);
			System.out.println(i);
			teclado.close();
		}	
	}