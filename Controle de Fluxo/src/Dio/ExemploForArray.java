package Dio;

public class ExemploForArray {

	public static void main(String[] args) {
		
		//Em Arrays o indice come�a em Zero
		String alunos [] = {"Felipe","Jonas","Julia","Marcos"};
		
		for(int x =0; x < alunos.length; x++) {
			
			System.out.println("O aluno do indice x = " + x + " � " + alunos[x] );
		}
		
		//Outro modo
		for(String aluno : alunos) {
			
			System.out.println("Nome do Aluno �: " + aluno);
		}
		
	}
}
