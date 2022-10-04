package Dio;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		System.out.println("Crie um conjunto e adicione as notas");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3, 5d, 7d, 0d, 3.6));
		
		//Elemento duplicado foi automaticamente retirado
		System.out.println(notas.toString());
		
		//Posição da Nota 5 - Não tem como saber qual a posição
		//Adicionar não tem como
		//exibir terceira nota adicionada não tem como
		
		//Conferir se a nota 5 está no conjunto
		System.out.println("nota 5 está no conjunto: " + notas.contains(5d));
		
		//Exibir a menor nota
		System.out.println("Menor nota: " + Collections.min(notas));
		
		//Maior nota
		System.out.println("Maior nota: " + Collections.max(notas));
		
		//Soma das notas
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		
		System.out.println("Soma das notas: " + soma);
		
		//Medias das Notas
		System.out.println("Médias das notas: " + soma/notas.size());
		
		//Remover a nota Zero
		notas.remove(0d);
		System.out.println("Notas removida a nota Zero: " + notas);
		
		//Remover notas menor que 7
		System.out.println("Remover notas menores que 7");
		Iterator<Double> iterator1 = notas.iterator();
		
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			
			if (next < 7) iterator1.remove();
		}
		System.out.println("Notas removidas menor que 7: " + notas);
		
		
	}
}
