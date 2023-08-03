package br.heranca.exemplo.com;

public class Pessoa {
	
	public String nome;
	public int idade;
	protected int cpf;
	 
	
	
	public Pessoa(String Nome, int Idade ) {
		this.nome = Nome;
		this.idade = Idade;
	}
	
	public void Consulta() {
		System.out.print("informe o nome");
	}
	
	protected void Atribuir() {
		
	}

}
