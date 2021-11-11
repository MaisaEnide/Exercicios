package Exercicios;

import java.util.*;

/*Faça um programa que peça uma nota entre 0 a 10. Mostre uma mensagem
caso o valor seja invalido e continue pedindo até que o usuario informe
um valor valido
*/
public class Nota {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int nota = 0;
		
		 while (true) {
			 System.out.println("Informe uma nota entre 0 e 10: ");
			 nota = entrada.nextInt();
			 if (nota >= 0 && nota <= 10) {
				break;
			
			}else {
				System.out.println("Valor invalido ");
			}

		 }
		  System.out.println("Sua nota é: " + nota);
		 
		 
		 
	}

}
