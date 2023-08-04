package br.exemploArrayListBase;

import java.util.ArrayList;

public class ArraysList {
	
	public static void main(String[] args) {
		
		ArrayList<String> contatos = new ArrayList<>();
		contatos.add("joao");
		contatos.add("9990-0000");
		contatos.add("jvalves");
		contatos.add("leticia");
		contatos.add("66666-9998");
		contatos.add("leticiass");
		
		System.out.println("tamanho do array: "+ contatos.size());
		System.out.println(contatos);
		System.out.println("emial do joao é (indice[2]) :"+ contatos.get(2));
	
	}
	
	

}
