package ProcessoSeletivo;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoFiltraCandidatos {

	public static void main(String[] args) {
		
		String [] candidatos= {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};;
		
		selecaoCandidato(candidatos);
		imprimirSelecionados(candidatos);
		
		for(String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas=1;
		boolean continuarTentando=true;
		boolean atendeu=false;
		
		do {
			atendeu = atenderLigacao();
			continuarTentando = !atendeu;
			
			if(continuarTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("CONTATO REALIZADO COM SUCESSO!");
			}
		} while (continuarTentando && tentativasRealizadas<3);
		
		if(atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + " na " + tentativasRealizadas + " tentativa de contato");
		}else{
			System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + " com o NÚMERO MÁXIMO DE TENTATIVAS");
		}
	}
	
	static boolean atenderLigacao() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirSelecionados(String[] candidatos) {
		
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		
		System.out.println("===========LISTA COM FOR========================");
		for (int indice=0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de número: " + (indice+1) + " é " + candidatos[indice]);
		}
		
		System.out.println("===========FORMA ABREVIADA========================");
			for(String candidato : candidatos) {
				System.out.println("O candidato selecionado foi: " + candidato);
			}
	}

	static void selecaoCandidato(String[] candidatos) {
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		
		System.out.println("===========LISTA COMPLETA DE CANDIDATOS========================");
		
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou esse valor de salário: " + String.format("%.2f", salarioPretendido));
			
			
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato: " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}else {
				System.out.println("O candidato: " + candidato + " NAO foi selecionado para a vaga");
			}
			
			candidatosAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}

	static void analisarCandidato(double salarioPretendido) {
		double salarioBase=2000.0;
		
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o Candidato");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o Candidato com contra proposta");
		}else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
	}
	
	
}
