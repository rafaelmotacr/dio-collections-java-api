package main.java.list.OperacoesBasicas.app;

import main.java.list.OperacoesBasicas.model.CarrinhoDeCompras;

public class Program {

	public static void main(String[] args) {
		
		CarrinhoDeCompras minhasCompras = new CarrinhoDeCompras();
		minhasCompras.adicionarItem("Mi Band", 200, 1);
		minhasCompras.adicionarItem("Mi Balance", 300, 1);
		minhasCompras.adicionarItem("Pulseira", 49.99, 1);
		System.out.println(minhasCompras.calcularValorTotal());
		minhasCompras.exibirItens();
		minhasCompras.removerItem("Mi Band");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		minhasCompras.exibirItens();
		
	}

}
