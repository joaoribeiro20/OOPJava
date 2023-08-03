package br.heranca.exemplo.com;

public class Pessoa {
	
	protected String nome;
	protected int idade;
	protected int cpf;
	 
	
	
	public Pessoa(String Nome, int Idade, int Cpf ) {
		this.nome = Nome;
		this.idade = Idade;
		this.cpf = Cpf;
	}
	
	public void Consulta() {
		System.out.print("informe o nome");
	}
	
	public void Atribuir() {
		
	}

}
