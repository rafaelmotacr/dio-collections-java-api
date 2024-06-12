package main.java.map.Pesquisa.app;

import main.java.map.Pesquisa.util.ContagemPalavras;

public class Program {
	  public static void main(String[] args) {
			ContagemPalavras contagemLinguagens = new ContagemPalavras();
			
			// Adiciona linguagens e suas contagens
			contagemLinguagens.adicionarPalavra("Java", 2);
			contagemLinguagens.adicionarPalavra("Python", 8);
			contagemLinguagens.adicionarPalavra("JavaScript", 1);
			contagemLinguagens.adicionarPalavra("C#", 6);
			
			// Exibe a contagem total de linguagens
			contagemLinguagens.exibirPalavras();
			
			// Encontra e exibe a linguagem mais frequente
			String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
			System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
	}
}
