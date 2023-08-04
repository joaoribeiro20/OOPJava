package br.exemploBase;

public class ArraysBase {

	public static void main(String[] args){
		String[] carros = {"ferrari","fusca","camaro","uno"	};
		System.out.println("tamanho do array: "+carros.length);
		System.out.println("carro :" + carros[2]);
		carros[2] = "caminhao";
		System.out.println("carro :" + carros[2]);
		System.out.println("____________________________________-");
		
		for (int i = 0; i < carros.length; i++) {
			System.out.println("----------------------");
			System.out.println("carro : " + carros[i]);
			System.out.println("----------------------");
		}
		
	}
}
