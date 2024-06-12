package main.java.map.OperacoesBasicas.Util;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	// Atributo: uma instanciacao da interface map;
	// Usa generics para especificar - bem como restringir - os tipos de dados aceitos;
	
	private Map <String, String> dicionario;
	
	// Construtor;
	// Aloca memoria para o objeto;
	
	public Dicionario() {
		this.dicionario = new HashMap <>();
	}
	
	
	// adicionarPalavra: Adiciona palavras novas ao dicionario;
	// lanca uma excecao caso a palavra ja exista no dicionario;
	
	public void adicionarPalavra(String palavra, String definicao) {
		if(this.dicionario.containsKey(palavra)) {
			throw new RuntimeException("Esta palavra ja existe no dicionario!");
		}
		this.dicionario.put(palavra, definicao);
	}
	
	
	// removerPalavra: remove palavras do dicionario;
	// lanca uma excecao caso a palavra nao exista no dicionario;
	// lanca uma excecao caso o dicionario esteja vazio;
	
	public void removerPalavra(String palavra) {
		if(this.dicionario.isEmpty()) {
			throw new RuntimeException("Nao existem palavras no dicionario!");
		}
		if(!this.dicionario.containsKey(palavra)) {
			throw new RuntimeException("Palavra nao existente no dicionario!");
		}
		this.dicionario.remove(palavra);		
	}
	
	
	// exibirPalavras: exibe todas as palavras do dicionario;
	// lanca uma excecao caso o dicionario esteja vazio;
	
	public void exibirPalavras() {
		if(this.dicionario.isEmpty()) {
			throw new RuntimeException("Nao existem palavras no dicionario!");
		}
		this.dicionario.forEach((palavra, definicao) -> {
		    System.out.println("Palavra: " + palavra + ", Definicao: " + definicao + ".");
		});	
	}
	
	
	// pesquisarPorPalavra: retorna a definicao de uma palavra presente no dicionario;
	// lanca uma excecao caso a palavra nao exista no dicionario;
	// lanca uma excecao caso o dicionario esteja vazio;
	
	public String pesquisarPorPalavra(String palavra) {
		if(this.dicionario.isEmpty()) {
			throw new RuntimeException("Nao existem palavras no dicionario!");
		}
		if(!this.dicionario.containsKey(palavra)) {
			throw new RuntimeException("Palavra nao existente no dicionario!");
		}
		return this.dicionario.get(palavra);
	}
	
	
}
