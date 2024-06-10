package main.java.list.Pesquisa.util;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	
	private List <Integer> listaDeNumeros;
	
	
	public SomaNumeros() {
		this.listaDeNumeros = new ArrayList <>();
	}
	
	public void adicionarNumero(int numero) {
		this.listaDeNumeros.add(numero);
	}
	
	
	public int calcularSoma() {
		int soma = 0;
		if(!this.listaDeNumeros.isEmpty()) {
			for(Integer integer : this.listaDeNumeros) {
				soma += integer;
			}
		}else {
			throw new RuntimeException("A LISTA ESTA VAZIA!!!");
		}
		return soma;
	}
	
	
	public int encontrarMaiorNumero() {
		if(this.listaDeNumeros.isEmpty()) {
			throw new RuntimeException("A LISTA ESTA VAZIA!!!");
		}
		int maiorNumeroDaLista = this.listaDeNumeros.get(0).intValue();
		for(int i = 1; i < this.listaDeNumeros.size(); i++) {
			maiorNumeroDaLista = Math.max(maiorNumeroDaLista,this.listaDeNumeros.get(i).intValue());
		}
		return maiorNumeroDaLista;			
	}
	
	
	public int encontrarMenorNumero() {
		if(this.listaDeNumeros.isEmpty()) {
			throw new RuntimeException("A LISTA ESTA VAZIA!!!");
		}
		int menorNumeroDaLista = this.listaDeNumeros.get(0).intValue();
		for(int i = 1; i < this.listaDeNumeros.size(); i++) {
			menorNumeroDaLista = Math.min(menorNumeroDaLista,this.listaDeNumeros.get(i).intValue());
		}
		return menorNumeroDaLista;			
	}
	
	
	public void exibirNumeros() {
		this.listaDeNumeros.stream().forEach(System.out:: println);
	}


}