package atividade;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto prod1 = new Produto();
		Produto prod2 = new Produto();
		Produto prod3 = new Produto ();
		prod1.setNome("Slims");
		prod1.setCodBarras(8907134597l);
		prod1.setPreco(760.00);
		prod1.setFornecedor("Plaza");
		prod2.setNome("SKS");
		prod2.setCodBarras(3417798950l);
		prod2.setPreco(1120.00);
		prod2.setFornecedor("Hilton");
		prod3.setNome("Special");
		prod3.setCodBarras(3701899574l);
		prod3.setPreco(980.00);
		prod3.setFornecedor("John Player");
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		listaProdutos.add(prod1);
		listaProdutos.add(prod2);
		listaProdutos.add(prod3);
		for (Produto produto : listaProdutos) {
			System.out.println("Cigarros "+produto.getNome());
			System.out.println("Código "+produto.getCodBarras());
			System.out.println("R$ "+produto.getPreco());
			System.out.println("Marca "+produto.getFornecedor());
			System.out.println("");
			
		}
	}

}
