package Dio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdernacaoList {

	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<Gato>() {{
			add(new Gato("Jon", 18, "preto"));
			add(new Gato("Simba", 6, "tigrado"));
			add(new Gato("Jon", 12, "amarelo"));
		}};
		
		System.out.println("Por ordem de inserção");
		System.out.println("======================");
		System.out.println(meusGatos);
		System.out.println("\n");
		
		System.out.println("Por ordem aleatória");
		System.out.println("======================");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		System.out.println("\n");
		
		System.out.println("Por ordem natural");
		System.out.println("======================");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
	
		System.out.println("\n");
		
		System.out.println("Por ordem de idade");
		System.out.println("======================");
		Collections.sort(meusGatos, new ComparatorIdade());
		System.out.println(meusGatos);

		System.out.println("\n");
		
		System.out.println("Por ordem de Cor");
		System.out.println("======================");
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		System.out.println("\n");
		
		System.out.println("Por ordem de Nome, Cor e Idade");
		System.out.println("======================");
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
	}
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {

		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if (nome !=0) return nome;

		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if (cor !=0) return cor;
		
		return Integer.compare(g1.getIdade(), g2.getIdade());

	}
	
}

class ComparatorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		// TODO Auto-generated method stub
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}

class ComparatorCor implements Comparator<Gato>{
	
	@Override
	public int compare(Gato g1, Gato g2) {
		// TODO Auto-generated method stub
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
}

class Gato implements Comparable<Gato>{
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public String getCor() {
		return cor;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	@Override
	public int compareTo(Gato gato) {
		
		return this.getNome().compareToIgnoreCase(gato.getNome());
		
	}

}