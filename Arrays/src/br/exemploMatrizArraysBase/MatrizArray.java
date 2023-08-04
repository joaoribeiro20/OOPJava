package br.exemploMatrizArraysBase;

public class MatrizArray {
	public static void main(String[] args) {
		String [][] agenda = {{"joao", "888-555", "jvalves"},{"leticia","5577-9966","leticiass"},
				{"teste","5559-888","teste55pp"}};
		
		
		System.out.println(agenda[0][1]);
		
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("_______________________________");
			for(int j = 0; j < agenda.length; j++) {
			System.out.println(agenda[i][j]);
			}
		}
	}

}
