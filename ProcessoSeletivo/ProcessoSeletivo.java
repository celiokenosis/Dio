package ProcessoSeletivo;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		System.out.println("Processe Seletivo");
		analisarCandidato(1900.0);
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);
	}
	
	public static void analisarCandidato(double salarioPretendido) {
		
		double salarioBase=2000.0;
		
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o Candidato");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o Candidato com contra proposta");
		}else {
			System.out.println("Aguardando resultado dos demais candidatos");
		}
	}
}
