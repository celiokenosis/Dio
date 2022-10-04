
public class Main {

	public static void main(String[] args) {

		Cliente celio = new Cliente();
		celio.setNome("Celio");
		
		Conta corrente = new ContaCorrente(celio);		
		Conta poupanca = new ContaPoupanca(celio);

		//Depositar
		corrente.depositar(100);
		
		//Transferir
		corrente.transferir(70, poupanca);

		//Imprimir
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}
