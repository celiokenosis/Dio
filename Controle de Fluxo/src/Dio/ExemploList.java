package Dio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
				
		List<Double> notas = new ArrayList<Double>();
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(1.8);
		notas.add(3.6);
		
		System.out.println("Lista com notas");
		System.out.println(notas);
		System.out.println(notas.toString());
		System.out.println("=========================");
		
		//Apenas a posição 5
		System.out.println("Posição da nota 5: " + notas.indexOf(5.0));
		System.out.println("=========================");
		
		//Adicionar a nota 8 na posição 4
		System.out.println("Adicionando a nota 8 na posição 4");
		notas.add(4,8.0);
		System.out.println(notas);
		System.out.println("=========================");
		
		//Substitur uma nota
		System.out.println("Substituir a nota 5 pela nota 6");
		notas.set(notas.indexOf(5.0), 6.0);
		System.out.println(notas);
		System.out.println("=========================");
		
		//Verificar se tem na lista a nota 5.0
		System.out.println("Verificar se existe a nota 5 na lista");
		System.out.println("Posição: " + notas.contains(7.0));
		System.out.println("=========================");
		
		//Imprimir as notas
		System.out.println("Notas");
		for (Double nota : notas) {
			System.out.println(nota);
		}
		System.out.println("=========================");
		
		//Terceira nota adicionada
		System.out.println(notas);
		System.out.println("Terceira nota adicionada: " + notas.get(2));

		System.out.println("=========================");
		
		//Terceira nota adicionada
		System.out.println("Menor nota: " + Collections.min(notas));
		
		//Terceira nota adicionada
		System.out.println("Menor nota: " + Collections.max(notas));
		

		//Soma
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("=========================");
		System.out.println("Soma das notas: " + soma);
		
		System.out.println("=========================");
		System.out.println("Média das notas: " + (soma/notas.size()));
		
		System.out.println("=========================");
		//Remover uma nota
		System.out.println(notas);
		System.out.println("Remove uma nota a 1.8");
		notas.remove(1.8);
		System.out.println(notas);
		
		//Remover as notas menores que 7
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()){
			
			double next = iterator1.next();
			
			if(next < 7) {
				iterator1.remove();
			}
			
			System.out.println("Remove notas menores que 7");
			System.out.println(notas);
			System.out.println("=========================");

		}
		
		//Remove toda a lista
		System.out.println("Remove toda a lista");
		notas.clear();
		System.out.println(notas);
		System.out.println("=========================");
		
		//Ver se a lista está vazia
		System.out.println("Lista Vazia? = " + notas.isEmpty());
		
		notas.add(7.0);
		System.out.println("Lista Vazia? = " + notas.isEmpty());
	}
}
