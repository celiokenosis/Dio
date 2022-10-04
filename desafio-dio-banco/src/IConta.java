
public interface IConta {

	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double Valor, Conta contaDestino);
	
	void imprimirExtrato();
	
}
