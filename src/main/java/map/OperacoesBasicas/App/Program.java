package main.java.map.OperacoesBasicas.App;

import main.java.map.OperacoesBasicas.Util.Dicionario;

public class Program {
	
	  public static void main(String[] args) {
		  
		    Dicionario dicionario = new Dicionario();

		    // Adicionar palavras (linguagens de programação)
		    dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
		    dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
		    dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

		    // Exibir todas as palavras
		    dicionario.exibirPalavras();

		    // Pesquisar palavras
		    String definicaoJava = dicionario.pesquisarPorPalavra("java");
		    System.out.println("Definição da linguagem 'java': " + definicaoJava);
		    String definicaoCSharp = null;
		    try {
		    	definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
		    }catch (RuntimeException e){
		    	System.out.println("Deu erro...");
		    }
		    System.out.println(definicaoCSharp);

		    // Remover uma palavra
		    dicionario.removerPalavra("typescript");
		    dicionario.exibirPalavras();
		  }

}
