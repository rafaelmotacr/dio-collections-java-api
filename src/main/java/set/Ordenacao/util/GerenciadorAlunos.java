package main.java.set.Ordenacao.util;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import main.java.set.Ordenacao.model.Aluno;

public class GerenciadorAlunos {
	
	// Atributos
	
	Set <Aluno> conjuntoDeAlunos;
	
	public GerenciadorAlunos() {
		this.conjuntoDeAlunos = new HashSet<>();
	}
	
	
	// Encontra e retorna um aluno com base em sua matricula, se houver alunos
	
	public Aluno findByMatricula(Long matricula) {
		if(this.conjuntoDeAlunos.isEmpty()) {
			throw new RuntimeException("Nao existem alunos cadastrados.");
		}
		for(Aluno aluno : this.conjuntoDeAlunos) {
			if(aluno.getMatricula().equals(matricula)) {
				return aluno;
			}
		}
		throw new RuntimeException("Nao existe aluno para esta matricula.");
	}
	
	// Metodo para adicionar um aluno cuja matricula nao se repita
	
	public void adicionarAluno(String nome, Long matricula, double media) {
		this.conjuntoDeAlunos.add(new Aluno(nome, media, matricula));
	}
	
	
	// Busca e remove um aluno
	
	public void removerAlunoPorMatricula(Long matricula) {
		Aluno alunoParaRemover = findByMatricula(matricula);
		this.conjuntoDeAlunos.remove(alunoParaRemover);
	}
	
	
	// Exibte todos os alunos, se houver alunos
	
	public void exibirAlunos() {
		if(this.conjuntoDeAlunos.isEmpty()) {
			throw new RuntimeException("Nao existem alunos cadastrados.");
		}
		this.conjuntoDeAlunos.stream().forEach(System.out :: println);
	}
	
	
	// Exibe todos os alunos em ordem alfabetica, se houver alunos
	
	public void exibirAlunosPorNome() {
		if(this.conjuntoDeAlunos.isEmpty()) {
			throw new RuntimeException("Nao existem alunos cadastrados.");
		}
		Set <Aluno> alunosPorNome = new TreeSet<>(new ComparatorAlunoByNome());
		alunosPorNome.addAll(this.conjuntoDeAlunos);
		alunosPorNome.stream().forEach(System.out :: println);
	}
	
	
	// Exibe todos os alunos de acordo com suas notas, se houver alunos
	
	public void exibirAlunosPorNota() {
		if(this.conjuntoDeAlunos.isEmpty()) {
			throw new RuntimeException("Nao existem alunos cadastrados.");
		}
		Set <Aluno> alunosPorNota = new TreeSet<>(new ComparatorAlunoByNota());
		alunosPorNota.addAll(this.conjuntoDeAlunos);
		alunosPorNota.stream().forEach(System.out :: println);
	}
	
	
}
