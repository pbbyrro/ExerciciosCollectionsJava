package exerciciosCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer, inicializada com 10 valores inteiros.
 * O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro 
 * e caso ele seja encontrado no ArrayList, exiba na tela a posição deste número na Collection
 * Caso o número não seja encontrado, ele deverá exibir na tela a mensagem:
 *  O número NN não foi encontrado!
 */

public class ExercicioCollections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(9);
		list.add(7);
		list.add(8);
		list.add(10);
		list.add(6);

		System.out.println("Insira um número:");
		int numeroUsuario = ler.nextInt();
		
		if(list.contains(numeroUsuario)) {
			System.out.println("O número " + numeroUsuario + " está localizado na posição: " + list.indexOf(numeroUsuario));
		} else {
			System.out.println("O número " + numeroUsuario + " não foi encontrado!");
		}
	}

}
