package Dio;

public class ResultadoEscolar {

	public static void main(String[] args) {
		
		int nota = 6;
		
		//Condição Ternaria
		
		String resultado = nota >= 7 ?"Aprovado" : nota >=5 ? "Em recuperação" :"Reprovado";
		
		System.out.println("Resultado: " + resultado);
		
		//Condição Comum
		
		if(nota >=7) {
			System.out.println("Aluno Aprovado");
			
		} else if(nota >= 5 && nota < 7){
			System.out.println("Aluno Em Recuperação");
			
		}else {
			System.out.println("Aluno Reprovado");
		}
	}
}
