package br.heranca.exemplo.base.com;

import java.util.Scanner;

public class Cadastro  extends Pessoa{ // se tirar essa parte (extends Pessoa) veremos que vai dar erro 
	
	Scanner ler = new Scanner(System.in);
	
	public void novoCadastro(){
		//repare que nao criamos nenhum atributo nessa classe
		//porque ja estemos herdando da classe pessoa todos atributos necessario
		//e tambem para nao ficar grande o codigo herdamos o metood cadastroSucesso
		System.out.print("Digite o seu nome: \n");
		nome = ler.next();
		System.out.print("Digite o seu idade: \n");
		idade = ler.nextInt();
		System.out.print("Digite o seu email: \n");
		email = ler.next();
		//o atributo a baixo senha possui o modificador de acesso protected, portanto 
		//apenas a classe pessoa e cadastro tem acesso a ela
		//podemos tentar instanciar a classe pessoa na calsse rodarTeste porem nao funciona
		//porque o modificador de acesso protected permite que so a proria classe ou classe
		//que herdar a classe pode ter acesso a esse atributo
		System.out.print("Digite o seu senha: \n");
		senha = ler.nextInt();
		//
		
		cadastroSucesso();
	}

}
