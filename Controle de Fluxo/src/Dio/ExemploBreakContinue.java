package Dio;

import java.util.Iterator;

public class ExemploBreakContinue {

	public static void main(String[] args) {
		
		for (int numero = 1; numero <= 5; numero++) {
			
			if(numero == 3) {
				System.out.println("Passou no IF");
				continue;
			}
			
			System.out.println("Número: " + numero);
		}
	}
}
