package br.com.joao.secao03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//Variaveis
		int quantidade_minima, quantidade_maxima;
		float estoque_medio;
		Scanner teclado	 = new Scanner(System.in);
		
		//Entradas
		System.out.print("Informe a quantidade minima: ");
		quantidade_minima = teclado.nextInt();
		//ctrl + barra de espaco escreve mais rapido system
		System.out.print("Informe a quantidade maxima: ");
		quantidade_maxima = teclado.nextInt();
		
		//processamento
		estoque_medio = (quantidade_minima + quantidade_maxima ) / 2;
		
		//saida
		System.out.println("O estoque medio e:" + estoque_medio);
		
		teclado.close();
	}

}