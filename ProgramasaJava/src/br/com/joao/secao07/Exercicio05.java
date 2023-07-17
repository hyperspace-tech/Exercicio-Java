package br.com.joao.secao07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		String nome, senha;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		nome = teclado.next();
		
		System.out.println("informe a senha: ");
		senha = teclado.next();
		
		while(nome.equals(senha)) {
			System.out.println("Erro: o nome de usuario e senha devem ser diferentes!");
			System.out.println("Informe o nome: ");
			nome = teclado.next();
			
			System.out.println("informe a senha: ");
			senha = teclado.next();
		}
		teclado.close();
	}
}
