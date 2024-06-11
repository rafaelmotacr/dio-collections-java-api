package main.java.set.Pesquisa.Model;

import java.util.Objects;

public class Tarefa {
	
	// Atributos
	
	private String descricao;
	private boolean concluida;
	
	// Constructor
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.concluida = false;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	// Getters e Setters
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isConcluida() {
		return concluida;
	}
	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}
	
	// Hashcode e equals
	
	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao);
	}
	
	// ToString

	@Override
	public String toString() {
		return "Tarefa [descricao=" + descricao + ", concluida=" + concluida + "]";
	}

}
