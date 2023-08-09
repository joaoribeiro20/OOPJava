package br.exemploBase.GetSetEncapsulamento;

public class User {
	
	private String firstName; //primeiro nome
	private String lastName; //sobrenome
	
	public String nomeCompleto() {
		return firstName  + "  " + lastName;
	}
	
	public void setFirsName(String firstName) {
		this.firstName = firstName.toLowerCase();
		
	}
	
	public String getFirsName() {
		return firstName;
	}
	//-----------------------------
	public void setLastName(String lastName) {
		this.lastName = lastName.toLowerCase();
		
	}
	
	public String getLastName() {
		return lastName;
	}
	

}
