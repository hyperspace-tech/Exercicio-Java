package br.com.joao.secao03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		float valor_por_hora;
		float salario;
		int horas_trabalhadas;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Quanto voce recebe por hora trabalhada: ");
		valor_por_hora = teclado.nextFloat();
		
		System.out.println("Quantas horas voce trabalhou esse mes: ");
		horas_trabalhadas = teclado.nextInt();
		
		salario = (horas_trabalhadas * valor_por_hora);
		
		System.out.println("Esse mes voce recebeu: " + salario);
		
		teclado.close();
	}

}
