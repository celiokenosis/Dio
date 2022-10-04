package Dio;
import java.util.Random;

public class ExemploDoWhile {

	public static void main(String[] args) {

		System.out.println("Discando...");
		
		do {
			System.out.println("Telefone tocando...");
		
		}while(tocando());
		
		System.out.println("Alo...");
	}
	
	private static boolean tocando() {
		
		//numero aleatorio entre 1 e 3 e se igual a 1 é verdadeiro (atendeu)
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		
		//negando o atendimento
		return !atendeu;
	}
}
