package main.java.set.OperacoesBasicas.util;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	
	private Set <String> conjuntoPalavrasUnicas;
	
	public ConjuntoPalavrasUnicas() {
		this.conjuntoPalavrasUnicas = new HashSet<String>();
	}
	
	
	public void adicionarPalavra(String palavra) {
		/*if(this.conjuntoPalavrasUnicas.contains(palavra)) {
			throw new RuntimeException("Esta palavra ja existe no conjunto!!!");
			
		}*/
		this.conjuntoPalavrasUnicas.add(palavra);
	}
	
	
	public void removerPalavra(String palavra) {
		if(this.conjuntoPalavrasUnicas.isEmpty()) {
			throw new RuntimeException("O conjunto esta vazio!!!");
		}
		if(!this.conjuntoPalavrasUnicas.contains(palavra)) {
			throw new RuntimeException("Esta palavra nao existe no conjunto!!!");
		}
		this.conjuntoPalavrasUnicas.remove(palavra);
	}
	
	
	public boolean verificarPalavra(String palavra) {
		return this.conjuntoPalavrasUnicas.contains(palavra);
	}
	
	
	public void exibirPalavrasUnicas() {
		this.conjuntoPalavrasUnicas.stream().forEach(System.out :: println);
	}

}
