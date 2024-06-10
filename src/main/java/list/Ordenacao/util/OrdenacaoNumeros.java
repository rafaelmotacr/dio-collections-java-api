package main.java.list.Ordenacao.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	
	private List <Integer> listaNumeros;
	
	public OrdenacaoNumeros() {
		this.listaNumeros = new ArrayList<>();
	}
	
	
	public void adicionarNumero(int numero) {
		this.listaNumeros.add((Integer) numero);
	}
	
	
	public List <Integer> ordenarAscendente(){
		if(this.listaNumeros.isEmpty()) {
			throw new RuntimeException("The list is empty");
		}
		List <Integer> listaAscendente = new ArrayList<>(this.listaNumeros);
		Collections.sort(listaAscendente);
		return listaAscendente;
	}

	
	public List <Integer> ordenarDescendente(){
		if(this.listaNumeros.isEmpty()) {
			throw new RuntimeException("The list is empty");
		}
		List <Integer> listaDescendente = new ArrayList<>(this.listaNumeros);
		listaDescendente.sort(Collections.reverseOrder());
		return listaDescendente;
	}
	
	
	public void exibirLista() {
		if(this.listaNumeros.isEmpty()) {
			throw new RuntimeException("The list is empty");
		}
		this.listaNumeros.stream().forEach(System.out :: println);
	}
	
	
}
