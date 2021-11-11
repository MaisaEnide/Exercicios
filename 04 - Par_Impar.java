package Exercicios;
import java.util.*;

/*Faça um programa que receba N numero inteiros,
 * calcule e mostre a quantidade de numeros pares
 * e a quantidade de numeros impares
 */

public class Par_Impar {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		int numero = 0;
		int par = 0;
		int impar = 0;
		
		System.out.println("Informe a quantidade de numeros de 6 a 10: ");
		int limite = entrada.nextInt();
		
		do {
			System.out.println("numero: ");
			numero = entrada.nextInt();
			contador++;
			if (numero %2 == 0) {
				par++;
			}else {
				impar++;
			}
		}while(contador < limite);
		
		System.out.println("Quantidade de pares: " + par);
		System.out.println("Quantidade de impares " + impar);
		
	}

}
