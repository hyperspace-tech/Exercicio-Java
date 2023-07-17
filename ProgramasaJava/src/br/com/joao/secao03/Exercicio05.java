package br.com.joao.secao03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//variaveis
		int metros = 0;
		int centimetros = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.print("Informe o valor em metros: ");
		metros = teclado.nextInt();
		
		//Processamento
		centimetros = (metros * 100);
		
		//saida
		System.out.print(metros + " metros em centimetros e: " + centimetros);
		
		teclado.close();
	}

} 