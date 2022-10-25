package com.edson.AdoptEasy.model;

public class PetCor {
	private int id=0;
	private String cor;
	private boolean ativo;

	public PetCor(int id, String cor, boolean ativo) {
		super();
		this.id = id;
		this.cor = cor;
		this.ativo = ativo;
	}

	public PetCor(String cor) {
		super();
		this.cor = cor;
	}

	public PetCor() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
