package main.java.set.OperacoesBasicas.app;

import main.java.set.OperacoesBasicas.util.ConjuntoPalavrasUnicas;

public class Program {
	
	 public static void main(String[] args) {
		    // Criando uma instância da classe ConjuntoPalavrasUnicas
		    ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

		    // Adicionando linguagens únicas ao conjunto
		    conjuntoLinguagens.adicionarPalavra("Java");
		    conjuntoLinguagens.adicionarPalavra("Python");
		    conjuntoLinguagens.adicionarPalavra("JavaScript");
		    conjuntoLinguagens.adicionarPalavra("Python");
		    conjuntoLinguagens.adicionarPalavra("C++");
		    conjuntoLinguagens.adicionarPalavra("Ruby");

		    // Exibindo as linguagens únicas no conjunto
		    conjuntoLinguagens.exibirPalavrasUnicas();

		    // Removendo uma linguagem do conjunto
		    conjuntoLinguagens.removerPalavra("Python");
		    conjuntoLinguagens.exibirPalavrasUnicas();

		    // Removendo uma linguagem inexistente
		    conjuntoLinguagens.removerPalavra("Swift");

		    // Verificando se uma linguagem está no conjunto
		    System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
		    System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

		    // Exibindo as linguagens únicas atualizadas no conjunto
		    conjuntoLinguagens.exibirPalavrasUnicas();
	 }
}
