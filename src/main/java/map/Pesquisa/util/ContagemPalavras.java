package main.java.map.Pesquisa.util;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	
	// Atributo
	
	private Map <String, Integer> palavrasMap;

	// Construtor
	
	public ContagemPalavras(){
		this.palavrasMap = new HashMap<String, Integer>();
	}
	
	
	/**
	 * Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente
	 *
	 * @param palavra a palavra que será usada como chave
	 * @param contagem o número de vezes que a palavra e repetida em um texto
	 * @throws RuntimeException se a palavra já fizer parte do mapa de palavras
	 */
	public void adicionarPalavra(String palavra, Integer contagem) {
	    if (this.palavrasMap.containsKey(palavra)) {
	        throw new RuntimeException("A palavra jaexiste no mapa de palavras.");
	    }
	    this.palavrasMap.put(palavra, contagem);
	}

	
	/**
	 * Remove uma palavra do dicionário, dado o termo a ser removido
	 *
	 * @param palavra A palavra que será usada como chave
	 * @throws IllegalArgumentException Se a palavra nao fizer parte do mapa de palavras
	 * @throws RuntimeException Se o mapa de palavras estiver vazio
	 */
	public void removerPalavra(String palavra) {
	    if (!this.palavrasMap.containsKey(palavra)) {
	        throw new IllegalArgumentException("A palavra nao existe no mapa de palavras.");
	    }
	    if (this.palavrasMap.isEmpty()) {
	        throw new RuntimeException("O mapa de palavras esta vazio.");
	    }
	    this.palavrasMap.remove(palavra);
	}
	
	
	/**
	 * Exibe todas as palavras e suas respectivas contagens
	 *
	 * @throws RuntimeException Se o mapa de palavras estiver vazio
	 */
	public void exibirPalavras() {
	    if (this.palavrasMap.isEmpty()) {
	        throw new RuntimeException("O mapa de palavras esta vazio.");
	    }
	    this.palavrasMap.forEach((k, v)->{
	    	System.out.println("Palavra: \"" + k + "\", numero de ocorrencias: " + v + ".");
	    });
	}
	
	
	/**
	 *  Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem
	 *  Percorre cada chave e valor de todo o mapa de palavras ate encontrar o mais alto
	 *
	 * @throws RuntimeException Se o mapa de palavras estiver vazio
	 */
	public String encontrarPalavraMaisFrequente() {
	    if (this.palavrasMap.isEmpty()) {
	        throw new RuntimeException("O mapa de palavras esta vazio.");
	    }
	    int maiorQuantidadeDeOcorrencias = 0;
	    String palavraMaisComum = null;
	    for(Map.Entry<String, Integer> entry : this.palavrasMap.entrySet()) {
	    	if(entry.getValue() > maiorQuantidadeDeOcorrencias) {
	    		maiorQuantidadeDeOcorrencias = entry.getValue();
	    		palavraMaisComum = entry.getKey();
	    	}	
	    }
	    return palavraMaisComum;
	}
		
	
}
