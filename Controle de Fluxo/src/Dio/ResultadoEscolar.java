package Dio;

public class ResultadoEscolar {

	public static void main(String[] args) {
		
		int nota = 6;
		
		//Condi��o Ternaria
		
		String resultado = nota >= 7 ?"Aprovado" : nota >=5 ? "Em recupera��o" :"Reprovado";
		
		System.out.println("Resultado: " + resultado);
		
		//Condi��o Comum
		
		if(nota >=7) {
			System.out.println("Aluno Aprovado");
			
		} else if(nota >= 5 && nota < 7){
			System.out.println("Aluno Em Recupera��o");
			
		}else {
			System.out.println("Aluno Reprovado");
		}
	}
}
