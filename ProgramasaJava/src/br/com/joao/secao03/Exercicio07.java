package br.com.joao.secao03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		float altura;
		float peso_ideal;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual sua altura: ");
		altura = teclado.nextFloat();
		
		peso_ideal = (float)(altura * 72.7) -58;
		
		System.out.printf("Seu peso ideal seria: %.2f" , peso_ideal);
		
		teclado.close();
		
	}

}
