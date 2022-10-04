package Dio;

import javax.swing.JOptionPane;

public class UncheckedException {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Numerador  : ");
		String b = JOptionPane.showInputDialog("Denominador: ");
		
		try {
			int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));	
			
			System.out.println("Resultado: " + resultado);
			
		} catch (NumberFormatException e) {
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Entrada inválida...Informe um número inteiro! " + e.getMessage());
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0 (Zero)! " + e.getMessage());
		} finally {
			System.out.println("Chegou até aqui");
		}
				
		System.out.println("O código continua...");
	}
	
	public static int dividir(int a , int b) {
		
		return a/b;
		
	}
}
