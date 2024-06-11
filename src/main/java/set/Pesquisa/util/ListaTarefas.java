package main.java.set.Pesquisa.util;

import java.util.HashSet;
import java.util.Set;
import main.java.set.Pesquisa.Model.Tarefa;

public class ListaTarefas {
	
	// Atributos
	
	private Set <Tarefa> conjuntoDeTarefas;
	
	// Construtor 
	
	public ListaTarefas() {
		this.conjuntoDeTarefas = new HashSet<>();
	}
	
	
	// Encontra tarefas por descricao, se a lista nao estiver vazia
	
	public Tarefa findTarefa(String descricao) {
		if(this.conjuntoDeTarefas.isEmpty()) {
			throw new RuntimeException("O conjunto de tarefas esta vazio. Impossivel encontrar tarefa.");
		}
		for(Tarefa tarefa : this.conjuntoDeTarefas) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
				return tarefa;
			}
		}
		throw new RuntimeException("A tarefa nao existe no conjunto.");
	}
	
	
	// Adiciona tarefas (unicas) ao conjunto
	
	public void adicionarTarefa(String descricao) {
		if(!(findTarefa(descricao) == null)) {
			throw new RuntimeException("A tarefa ja existe no conjunto.");
		}
		this.conjuntoDeTarefas.add(new Tarefa(descricao));
	}
	
	
	// Remove tarefas do conjunto, se elas existirem
	
	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = findTarefa(descricao);
		this.conjuntoDeTarefas.remove(tarefaParaRemover);
	}
	
	
	// Exibe todas as tarefas existentes no conjunto.
	// Caso esteja vazio, lanca uma excecao
	
	public void exibirTarefas() {
		if(this.conjuntoDeTarefas.isEmpty()) {
			throw new RuntimeException("Sem tarefas para exibir.");
		}
		this.conjuntoDeTarefas.stream().forEach(System.out :: println);
	}
	
	
	// Conta e retorna o total de tarefas, se o conjunto de tarefas nao for nulo
	
	public int contarTarefas() {
		if(this.conjuntoDeTarefas.isEmpty()) {
			throw new RuntimeException("O conjunto de tarefas esta vazio.");
		}
		return this.conjuntoDeTarefas.size();
	}
	
	
	// Retorna uma lista com todas as tarefas concluidas
	
	public HashSet <Tarefa> obterTarefasConcluidas(){
		if(this.conjuntoDeTarefas.isEmpty()) {
			throw new RuntimeException("O conjunto de tarefas esta vazio.");
		}
		HashSet <Tarefa> tarefasConcluidas = new HashSet<>();
		for(Tarefa tarefa : this.conjuntoDeTarefas) {
			if(tarefa.isConcluida()) {
				tarefasConcluidas.add(tarefa);			
			}
		}
		return tarefasConcluidas;
	}
	
	
	// Retorna uma lista com todas as tarefas pendentes
	
	public HashSet <Tarefa> obterTarefasPendentes(){
		if(this.conjuntoDeTarefas.isEmpty()) {
			throw new RuntimeException("O conjunto de tarefas esta vazio.");
		}
		HashSet <Tarefa> tarefasPendentes = new HashSet<>();
		for(Tarefa tarefa : this.conjuntoDeTarefas) {
			if(!tarefa.isConcluida()) {
				tarefasPendentes.add(tarefa);			
			}
		}
		return tarefasPendentes;
	}

	
	// Marca uma determinada tarefa como concluida, se ela for encontrada no conjunto
	
	public void marcarTarefaConcluida(String descricao) {
		Tarefa tarefaConcluida = findTarefa(descricao);
		tarefaConcluida.setConcluida(true);
	}
	
	
	// Marca uma determinada tarefa como pendente, se ela for encontrada no conjunto
	
	public void marcarTarefaPendente(String descricao) {
		Tarefa tarefaPendente = findTarefa(descricao);
		tarefaPendente.setConcluida(false);
	}
	
	
	// Apaga todas as tarefas (concluidas ou nao) da lista, se houver tarefas
	
	public void limparListaTarefas() {
		if(this.conjuntoDeTarefas.isEmpty()) {
			throw new RuntimeException("O conjunto de tarefas esta vazio. Nao e possivel limpar listas vazias.");
		}
		this.conjuntoDeTarefas.removeAll(conjuntoDeTarefas);
	}

}
