package Dio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {

	public static void main(String[] args) {
		
		List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");
		
		System.out.println("Imprimir a lista de String");
		numerosAleatorios.forEach(System.out::println);
		System.out.println("---------------------------------");
		
		System.out.println("Pegue os 5 primeiros núemros e coloque dentro de um Set");
		System.out.println("SET não aceita números repetidos. Se repetir ele elimina");
		numerosAleatorios.stream()
		.limit(5)
		.collect(Collectors.toSet())
		.forEach(System.out::println);
		
		System.out.println("---------------------------------");
		
		System.out.println("Transformar a lista de String em uma Lista de inteiros");
		
		numerosAleatorios.stream()
			.map(Integer::parseInt)
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
	}
}
