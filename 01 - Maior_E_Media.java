package Exercicios;

import java.util.*;

/*Faça um programa que leia 5 numeros
 * e informe o maior numero e a media entre eles
 */

public class Maior_E_Media {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int contador = 0;
		int numero = 0;
		int maiorNumero = 0;
		int guardaNumero = 0;
		
		do {
			
			System.out.println("Numero");
			numero = entrada.nextInt();
			contador++;
			guardaNumero = guardaNumero + numero;
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
		}
		
		while (contador < 5);
		
		System.out.println("Maior numero é: " + maiorNumero);
		System.out.println("A media é: " + guardaNumero/contador);
		
		}
		
	}
	


