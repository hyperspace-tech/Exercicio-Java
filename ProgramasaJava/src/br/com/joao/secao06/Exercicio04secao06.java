package br.com.joao.secao06;

import java.util.Scanner;

public class Exercicio04secao06 {

	public static void main(String[] args) {
		float altura;
		float peso_ideal;
		char sexo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		altura = teclado.nextFloat();
		
		System.out.print("Informe seu sexo m/f: ");
		sexo = teclado.next().charAt(0);
		
		if(sexo == 'm') {
			peso_ideal = (float)(altura * 72.7) -58;
			System.out.printf("Seu peso ideal e: %.1f" , peso_ideal);
		}else if(sexo == 'f' ) {
			peso_ideal =(float)(altura * 62.1) - (float)44.7;
			System.out.printf("Seu peso ideal e: %.1f" , peso_ideal);
		}else if(sexo != 'm' && sexo != 'f') {;
		System.out.println("Sexo nao reconhecido ! ");
		peso_ideal = 0;
		}
		teclado.close();

	}

}