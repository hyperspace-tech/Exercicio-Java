package br.com.joao.secao07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
        int contador_total = 0;
        int contador_sit_1 = 0;
        int contador_sit_2 = 0;
        int contador_sit_3 = 0;
        int contador_sit_4 = 0;
        int identificacao;
        int defeito;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a identificacao");
        identificacao = teclado.nextInt();

        while (identificacao != 0) {
            System.out.println("1 - Necessita de esfera:");
            System.out.println("2 - Necessita de Limpeza: ");
            System.out.println("3 - Necessita de troca de cabo ou conector: ");
            System.out.println("4 - Quebrado ou inutilizado: ");
            System.out.println("Informe o defeito: ");

            defeito = teclado.nextInt();
            if (defeito == 1) {
                contador_sit_1 = contador_sit_1 + 1;
            } else if (defeito == 2) {
                contador_sit_2 = contador_sit_2 + 1;
            } else if (defeito == 3) {
                contador_sit_3 = contador_sit_3 + 1;
            } else if (defeito == 4) {
                contador_sit_4 = contador_sit_4 + 1;
            } else {
                System.out.println("Invalid input. Please enter a valid value.");
            }
            contador_total = contador_total + 1;

            System.out.println("Informe a identificacao: ");
            identificacao = teclado.nextInt();
            
            float p1, p2, p3, p4;
            p1 = ((float) contador_sit_1 / (float) contador_total) * (float) 100.00;
            p2 = ((float) contador_sit_2 / (float) contador_total) * (float) 100.00;
            p3 = ((float) contador_sit_3 / (float) contador_total) * (float) 100.00;
            p4 = ((float) contador_sit_4 / (float) contador_total) * (float) 100.00;

            System.out.printf("Quantidades de mouse %d\n", contador_total);
            System.out.println("Situacao \t\t\t\tQuantidade \tPercentual");
            System.out.printf("1-Necessidade de esfera \t\t\t%d \t\t%.2");
            
            }
        teclado.close();
	}
}
