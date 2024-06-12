package main.java.map.Ordenacao.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import main.java.map.Ordenacao.models.Livro;
import main.java.map.Pesquisa.util.ComparatorLivroPorAutor;
import main.java.map.Pesquisa.util.ComparatorLivroPorPreco;

public class LivrariaOnline {
	
	Map <String, Livro> livros;
	
	public LivrariaOnline() {
		this.livros = new HashMap<>();
	}
	
	public String findByTitulo(String titulo) {
		if(this.livros.isEmpty()) {
			throw new RuntimeException("A livraria nao possui livros no momento");
		}
		Livro livroEncontrado = null;
		String linkDoLivro;
		for(Map.Entry <String, Livro> entry : this.livros.entrySet()) {
			livroEncontrado = entry.getValue();
			linkDoLivro = entry.getKey();
			if(livroEncontrado.getTitulo().equals(titulo)) {
				return linkDoLivro;
			}
		}
		throw new IllegalArgumentException("Este livro nao existe na livraria atualmente");
	}
	

	public void adicionarLivro(String link, Livro livro) {
		if(this.livros.containsKey(link)){
			throw new RuntimeException("Um livro com o mesmo link ja existe.");
		}
		this.livros.put(link, livro);
	}
	

	public void removerLivro(String titulo) {
		if(this.livros.containsKey(titulo)){
			throw new RuntimeException("Um livro com o mesmo link ja existe.");
		}
		String livroParaRemover = findByTitulo(titulo);
		this.livros.remove(livroParaRemover);
	}
	
	
	public Map <String, Livro>exibirLivrosOrdenadosPorPreco(){
		if(this.livros.isEmpty()) {
			throw new RuntimeException("A livraria nao possui livros no momento");
		}
		 List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livros.entrySet());
		 
		 Collections.sort(livrosParaOrdenarPorPreco, new ComparatorLivroPorPreco());
		 
		 Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
		 
		 for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
		    livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
		  }
		
		  return livrosOrdenadosPorPreco;
	}
	
	
	
	  public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
			if(this.livros.isEmpty()) {
				throw new RuntimeException("A livraria nao possui livros no momento");
			}
		    List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livros.entrySet());

		    Collections.sort(livrosParaOrdenarPorAutor, new ComparatorLivroPorAutor());

		    Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

		    for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
		      livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
		    }

		    return livrosOrdenadosPorAutor;
	  }
	  
	  
	  public List<Livro> obterLivroMaisCaro() {
		  if(this.livros.isEmpty()) {
				throw new RuntimeException("A livraria nao possui livros no momento");
		  }
			
		  List<Livro> livrosMaisCaros = new ArrayList<>();
		  double precoMaisAlto = Double.MIN_VALUE;
		  
		  for(Entry<String, Livro> entry: this.livros.entrySet()) {
			  if(entry.getValue().getPreco() > precoMaisAlto) {
				  precoMaisAlto = entry.getValue().getPreco();
			  }
		  }
		  for(Entry<String, Livro> entry: this.livros.entrySet()) {
			  if(entry.getValue().getPreco() == precoMaisAlto) {
				  livrosMaisCaros.add(entry.getValue());
			  }
		  }
		  return livrosMaisCaros;
	  }
	  
	  
	  
	  public List<Livro> obterLivroMaisBarato() {
		  if(this.livros.isEmpty()) {
				throw new RuntimeException("A livraria nao possui livros no momento");
		  }
			
		  List<Livro> livrosMaisCaros = new ArrayList<>();
		  double precoMaisBaixo = Double.MAX_VALUE;
		  
		  for(Entry<String, Livro> entry: this.livros.entrySet()) {
			  if(entry.getValue().getPreco() < precoMaisBaixo) {
				  precoMaisBaixo = entry.getValue().getPreco();
			  }
		  }
		  for(Entry<String, Livro> entry: this.livros.entrySet()) {
			  if(entry.getValue().getPreco() == precoMaisBaixo) {
				  livrosMaisCaros.add(entry.getValue());
			  }
		  }
		  return livrosMaisCaros;
	  }
	  
	  
	  public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
		  if(this.livros.isEmpty()) {
				throw new RuntimeException("A livraria nao possui livros no momento");
		  }
		  Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
		  	for (Map.Entry<String, Livro> entry : livros.entrySet()) {
		  		Livro livro = entry.getValue();
		  		if (livro.getAutor().equals(autor)) {
		  			livrosPorAutor.put(entry.getKey(), livro);
		  			}
		  		}
		  return livrosPorAutor;
	} 
	
}
