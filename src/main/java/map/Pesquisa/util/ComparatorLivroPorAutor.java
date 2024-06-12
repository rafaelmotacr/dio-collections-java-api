package main.java.map.Pesquisa.util;

import java.util.Comparator;
import java.util.Map.Entry;

import main.java.map.Ordenacao.models.Livro;

public class ComparatorLivroPorAutor implements Comparator <Entry<String, Livro>> {

	@Override
	public int compare(Entry<String, Livro> entry1, Entry<String, Livro> entry2) {
		return entry1.getValue().getAutor().compareToIgnoreCase(entry2.getValue().getAutor());
	}

}
