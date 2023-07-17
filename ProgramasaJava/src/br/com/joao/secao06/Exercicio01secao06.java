package br.com.joao.secao06;

import java.util.Scanner;

public class Exercicio01secao06 {

	public static void main(String[] args) {
		int n;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("digite um numero: ");
		n = teclado.nextInt();
		
		if(n > 100) {
			System.out.println(n);			
		}else {
			n = 0;
			System.out.println(n);
		}
		teclado.close();
	}

}
