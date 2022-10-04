package Dio;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		double saldo = 25.0;
		double valorSolicitado = 19.0;
		
		if(valorSolicitado < saldo) {
			
			System.out.println("Saldo Atual: " + saldo);
			System.out.println("Valor Saque: " + valorSolicitado);
			
			saldo = saldo - valorSolicitado;
			
			System.out.println("Novo saldo: " + saldo);
		
		}else {
			System.out.println("Saldo Insuficiente");
		}
	}
}
