package main.java.map.Pesquisa.util;

import java.util.Comparator;
import java.util.Map.Entry;

import main.java.map.Ordenacao.models.Livro;

public class ComparatorLivroPorPreco implements Comparator <Entry<String, Livro>> {

	@Override
	public int compare(Entry<String, Livro> entry1, Entry<String, Livro> entry2) {
		return Double.compare(entry1.getValue().getPreco(), entry2.getValue().getPreco());
	}
}
