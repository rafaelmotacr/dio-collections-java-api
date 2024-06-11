package main.java.set.Ordenacao.model;

import java.util.Objects;

public class Aluno implements Comparable <Aluno>{

	// Atributos
	
	private String nome;
	private Double media;
	private Long matricula;
	
	// Construtor.
	
	public Aluno(String nome, Double media, Long matricula) {
		super();
		this.nome = nome;
		this.media = media;
		this.matricula = matricula;
	}

	
	// Getters and Setters
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getMedia() {
		return media;
	}


	public void setMedia(Double media) {
		this.media = media;
	}
	

	public Long getMatricula() {
		return matricula;
	}


	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	// HashCode
	
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}


	// Equals
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
	
	// Implementacao da interface comparable
	
	@Override
	public int compareTo(Aluno aluno) {
		return this.nome.compareToIgnoreCase(aluno.getNome());
	}

	// ToString

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", media=" + media + ", matricula=" + matricula + "]";
	}
	
}
