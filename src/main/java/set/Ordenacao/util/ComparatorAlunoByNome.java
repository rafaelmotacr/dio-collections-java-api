package main.java.set.Ordenacao.util;

import java.util.Comparator;

import main.java.set.Ordenacao.model.Aluno;

public class ComparatorAlunoByNome implements Comparator <Aluno>{

	@Override
	public int compare(Aluno aluno1, Aluno aluno2) {
		return aluno1.getNome().compareToIgnoreCase(aluno2.getNome());
	}

}