package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class SistemaDeCompras {

	//String 
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	//Int
	static Integer inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	//Double
	static Double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	//valor total da compra
	static double valorTotal() {
		
	}
	
	public static void main(String[] args) {
		// Instanciar objetos
		
		//preparar a quantidade de posicoes 
		Produto[] vetorProduto = new Produto[3];
		
		// controlar posicoes de entrada de cada produto
		int indice = 0;
		
		// faça
		do {
			
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setCodigo(inteiro("Digite o Codigo do Produto"));
			vetorProduto[indice].setTipo(texto("Tipo de Produto"));
			vetorProduto[indice].setMarca(texto("Marca"));
			vetorProduto[indice].setQuantidade(inteiro("Quantidade"));
			vetorProduto[indice].setValor(real("Valor do Produto"));
			
			indice ++;
			
		// enquanto	
		}while(JOptionPane.showConfirmDialog(null, "Adicionar mais Produto",
				"Carrinho de Commpras", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE) ==0);
		

		// FOR
		for(int contador = 0; contador < indice; contador ++ ) {
		
			System.out.println("________Informações do Prdoduto________" +
			"\n\nCódigo: " + vetorProduto[contador].getCodigo()+
			"\nTipo: " + vetorProduto[contador].getTipo()+
			"\nMarca: " + vetorProduto[contador].getMarca()+
			"\nQuantidade: " + vetorProduto[contador].getQuantidade() +
			"\nValor: R$" + vetorProduto[contador].getValor());
		}

	}
}
