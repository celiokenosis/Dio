package Dio;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExemploMap {

	public static void main(String[] args) {
		/*
		 * Gol - 14,4 km/l
		 * Uno - 15,6 km/l
		 * Mobi - 16,1 km/l
		 * Hb20 - 14,5 km/l
		 * Kwid - 15,6 km/l
		 */
		
		System.out.println("Crie um dicionário e seus respectivos consumos!");
		
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("Gol",14.4);
			put("Uno",15.6);
			put("Mobi",16.1);
			put("Hb20",14.5);
			put("Kwid",15.6);
		}};
		
		System.out.println(carrosPopulares);
		
		//susbtituir consumo do GOL
		carrosPopulares.put("Gol", 15.2);
		System.out.println(carrosPopulares);
		
		//checar se Tucson está na chave
		System.out.println("Tucson está na lista? " + carrosPopulares.containsKey("Tucson"));
		System.out.println("Uno está na lista? " + carrosPopulares.containsKey("Uno"));
		
		//exibir o consumo
		System.out.println("Consumo do Uno: " + carrosPopulares.get("Uno"));
		
		//exibir os modelos
		System.out.println("Modelos:");
		Set<String> modelos = carrosPopulares.keySet();
		System.out.println(modelos);
		
		//exibir os consumos
		System.out.println("Consumos:");
		Collection<Double> consumos = carrosPopulares.values();
		System.out.println(consumos);
		
		//Mais economico
		System.out.println("============Mais Economico============");
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		
		String modeloMaisEficiente = "";
		
		for(Map.Entry<String, Double> entry: entries) {
			if(entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " " + consumoMaisEficiente);
			}
		}
		
		//Modelo menos economico
		System.out.println("============Menos Economico============");
		Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
		
		String modeloMenosEficiente = "";
		
		for(Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
			if(entry.getValue().equals(consumoMenosEficiente)) {
				modeloMenosEficiente = entry.getKey();
				System.out.println("Modelo Menos Eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
			}
		};
		
		//A soma dos consumos
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0d;
		
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println("============Soma dos Consumos============");
		System.out.println("A soma dos consumos: " + soma);
		
		//A media dos carros
		System.out.println("============Média dos Consumos============");
		System.out.println("A média dos consumos: " + (soma/carrosPopulares.size()));
		
		
		//Remover consumo 15.6
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		System.out.println("============Remover============");
		System.out.println(carrosPopulares);
		
		while(iterator1.hasNext()) {
			if(iterator1.next().equals(15.6)) {
				iterator1.remove();
			}
		}
		System.out.println(carrosPopulares);
		
	}
		
}
