package br.com.joao.secao06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		float indice;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o indice de poluicao: ");
		indice = teclado.nextFloat();
		
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("ATENCAO: Industria do 1o grupo devem suspender as atividades; ");
		}else if (indice >= 0.4 && indice < 0.5) {
			System.out.println("ATENCAO: industrias do 1g e 2g devem suspender as atividades: ");
		}else if (indice >=0.5) {
			System.out.println("ATENCAO: todos os grupos devem suspender as atividades: ");
		}
		teclado.close();
	}

}
