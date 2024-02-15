package exerciciosCollections;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer.
 * O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos e adicione-os individualmente na Collection Set.
 * Em seguida, faça o que se pede:
 * Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 
 */

public class ExercicioCollections3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Set<Integer> setNumeros = new HashSet<Integer>();
		int numero;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Insira o número " + (i + 1) + ": ");
			numero = ler.nextInt();
			setNumeros.add(numero);
		}
		
		Iterator<Integer> isetNumeros = setNumeros.iterator();
		
		System.out.println("Listar dados do Set:");
		
		while(isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}
	}

}
