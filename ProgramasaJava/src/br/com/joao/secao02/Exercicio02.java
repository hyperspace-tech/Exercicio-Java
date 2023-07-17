package br.com.joao.secao02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//variaveis
		int num1, num2, soma, multiplicacao;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o primeiro numero: ");
		num1 = teclado.nextInt();

		System.out.println("Informe o segundo numero: ");
		num2 = teclado.nextInt();

		//Processamento
		soma = num1 + num2;
		multiplicacao = soma * num1;
		
		System.out.println("O resultado da multiplicacao e: " + multiplicacao);
		
		//saida
		teclado.close();
		
		
	}

}