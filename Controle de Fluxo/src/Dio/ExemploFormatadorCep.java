package Dio;

public class ExemploFormatadorCep {

	public static void main(String[] args) {
		
		try {
			String cepFormatado = formatarCep("2376506");
			System.out.println("Cep Formatado: " + cepFormatado);
		
		} catch (CepInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println("Cep não valido...");;
		}
	}
	
	static String formatarCep(String cep) throws CepInvalidoException{
		
		if(cep.length() != 8) {
			throw new CepInvalidoException();
		}
		
		return "23.765-064";
		
	}
}
