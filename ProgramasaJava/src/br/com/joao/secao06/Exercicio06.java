package br.com.joao.secao06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int c;
		float n, e = 0;
		float salario;
		float valor_por_hora = (float) 10.00;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o codigo: ");
		c = teclado.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		n = teclado.nextFloat();
		
		if(n >=50) {
			e = (float)(n - 50) * (float)20.00;
			salario = (50 * valor_por_hora) + e;
			System.out.printf("salario total: %.2f\n", salario);
			System.out.printf("salario exedente: %.2f\n", e);
		}else {
			salario = n * valor_por_hora;
			System.out.printf("salario total: %.2f\n", salario);
			System.out.printf("salario exedente: %.2f\n", e);
		}
		teclado.close();
	}
}