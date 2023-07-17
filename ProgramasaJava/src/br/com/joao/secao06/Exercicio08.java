package br.com.joao.secao06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o um numero: ");
		numero = teclado.nextInt();
		
		if(numero % 2 == 0) {
			if(numero > 0) {
				System.out.printf("O numero %d e par e positivo.\n" , numero);
		}else {
			System.out.printf("O numero %d e par e negativo.\n" , numero);
		}
	}else {
			if(numero > 0) {
				System.out.printf("O numero %d e impar e positivo.\n" , numero);
				}else {
					System.out.printf("O numero %d e impar e negativo.\n" , numero);
		}
		teclado.close();
		}
	}
}