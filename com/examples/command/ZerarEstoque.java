package com.examples.command;

import interfaces.IPedido;

public class ZerarEstoque implements IPedido {

	private Produto prod;

	public ZerarEstoque(Produto prod) {
		this.prod = prod;
	}

	@Override
	public void execute() {
		prod.zerarEstoque();
		System.out.println("O estoque do produto " + prod.nomeProduto + " está " + prod.quantidade);
	}

}
