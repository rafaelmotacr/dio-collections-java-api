package model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List <Item> listaDeItens;

	public CarrinhoDeCompras() {
		this.listaDeItens = new ArrayList <>();
	}
	
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		this.listaDeItens.add(new Item(nome, preco, quantidade));
	}
	
	
	public void removerItem(String nome) {
		List <Item> itensParaRemover = new ArrayList <>();
		if(!this.listaDeItens.isEmpty()) {
			for(Item item : this.listaDeItens) {
				if(item.getNome().equalsIgnoreCase(nome)) {
					itensParaRemover.add(item);
				}
			}
			this.listaDeItens.removeAll(itensParaRemover);		
		}else {
			System.out.println("O CARRINHO ESTA VAZIO!!!");
		}
	}
	
	
	public double calcularValorTotal() {
		double valorTotal = 0.0;
		if(!this.listaDeItens.isEmpty()) {
			for(Item item : this.listaDeItens) {
				valorTotal += item.getPreco() * item.getQuantidade();
			}
		}else {
			 throw new RuntimeException("O CARRINHO ESTA VAZIO!!!");
		}
		return valorTotal;
	}
	
	
	public void exibirItens() {
		if(!this.listaDeItens.isEmpty()) {
			this.listaDeItens.stream().forEach(System.out :: println);
		}else {
			System.out.println("O CARRINHO ESTA VAZIO!!!");
		}
	}
	
	
}
