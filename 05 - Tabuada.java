package Exercicios;
import java.util.*;

/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada
 * de qualquer numero interio. O usuario deve 
 * informar de qual numero ele deseja ver a tabuada.
 */

public class Tabuada {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Tabuada do: ");
		int multiplicando=entrada.nextInt();
        System.out.println("-----------");		
		for (int i =0; i <= 10; i++) {
				
			System.out.println(multiplicando + "X" + i + "=" + multiplicando * i);

			}
			
		}
		
	}

