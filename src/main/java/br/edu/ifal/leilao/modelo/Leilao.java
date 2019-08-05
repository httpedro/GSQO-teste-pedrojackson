package br.edu.ifal.leilao.modelo;

import java.util.ArrayList;
import java.util.List;

public class Leilao {
	private List<Lance> lances;
	private Produto produto ;
	
	public Leilao() {
		this.lances = new ArrayList<Lance>();
	}
	
	public void propoe(Lance lance) {
		this.lances.add(lance);
	}

	public List<Lance> getLances() {
		return lances;
	}

	public void setLances(List<Lance> lances) {
		this.lances = lances;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	
}
