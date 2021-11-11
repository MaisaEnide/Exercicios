package Exercicios;
import java.util.*;

/*Faça um programa que calcule um fatorial de um numero inteiro
 * fornecido pelo usuario.
 */

public class Fatorial {
	
	public static void main(String[] args) {
		
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe numero: ");
		numero = entrada.nextInt();
		System.out.println("");
		System.out.println(numero + "!");
		
		int contador = numero -1;
		
		while(contador > 1){
			
			int calculador = numero*contador;

			contador--;
			numero = calculador;
			System.out.println(numero);
		}
	
		System.out.println("");
		System.out.println("Resultado: " + numero);
	}

}
