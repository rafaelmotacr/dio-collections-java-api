package main.java.list.Ordenacao.app;
import main.java.list.Ordenacao.util.OrdenacaoNumeros;

public class Program {
	
	public static void main(String args[]) {
		
		OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
		ordenacaoNumeros.adicionarNumero(6);
		ordenacaoNumeros.adicionarNumero(5);
		ordenacaoNumeros.adicionarNumero(3);
		ordenacaoNumeros.adicionarNumero(7);
		ordenacaoNumeros.adicionarNumero(9);
		
		System.out.println(ordenacaoNumeros.ordenarDescendente());
		System.out.println(ordenacaoNumeros.ordenarAscendente());
		
		
	}

}
