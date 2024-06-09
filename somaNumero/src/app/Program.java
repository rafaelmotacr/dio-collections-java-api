package app;

import util.SomaNumeros;

public class Program {
	
	public static void main(String args[]) {
		
		SomaNumeros somarNumeros = new SomaNumeros();
		
		somarNumeros.adicionarNumero(2);
		somarNumeros.adicionarNumero(6);
		somarNumeros.adicionarNumero(8);
		somarNumeros.adicionarNumero(5);
		System.out.println(somarNumeros.encontrarMaiorNumero());
		System.out.println(somarNumeros.encontrarMenorNumero());
		
	}

}
