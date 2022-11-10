
package com.edson.AdoptEasy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PetCor {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String cor;
	private boolean ativo;

	public PetCor(int id, String cor, boolean ativo) {
		super();
		this.id = id;
		this.cor = cor;
		this.ativo = ativo;
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
