package exerciciosCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String.
 * O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList.
 * Em seguida, faça o que se pede:
 * Mostre na tela todas as cores que foram adicionadas. 
 * Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
 */

public class ExercicioCollections1 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    ArrayList<String> cores = new ArrayList<String>();
    String cor;

    for (int i = 0; i < 5; i++) {
        System.out.println("Insira uma cor: ");
        cor = ler.nextLine();
        cores.add(cor);
    	}
    
    System.out.println("Listar todas as cores:");
    System.out.println(" ");
    
    for (String s:cores)
    	System.out.println(s);
    
    System.out.println(" ");
    System.out.println("Ordenar as cores:");
    System.out.println(" ");
    
    Collections.sort(cores);
    
    for (String s:cores)
    	System.out.println(s);
   
    }
    
    
    
    
}

