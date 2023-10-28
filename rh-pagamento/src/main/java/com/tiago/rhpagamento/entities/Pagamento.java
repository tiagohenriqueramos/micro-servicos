package com.tiago.rhpagamento.entities;

import java.io.Serializable;

public class Pagamento implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private Double ganhoDia;
	private Integer dias;
	
	public Pagamento() {}
	public Pagamento(String nome, Double ganhoDia, Integer dias) {
		super();
		this.nome = nome;
		this.ganhoDia = ganhoDia;
		this.dias = dias;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getGanhoDia() {
		return ganhoDia;
	}
	public void setGanhoDia(Double ganhoDia) {
		this.ganhoDia = ganhoDia;
	}
	public Integer getDias() {
		return dias;
	}
	public void setDias(Integer dias) {
		this.dias = dias;
	}
	
	public double getTotal() {
		return dias * ganhoDia;
	}
}
