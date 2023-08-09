package br.exemploBase.GetSetEncapsulamento;

public class Main {
	
	public static void main(String[] args) {
		User usuarioA = new User();
		usuarioA.setFirsName("joao");
		usuarioA.setLastName("ribeiro");
		
		System.out.print(usuarioA.nomeCompleto());
	}
}
