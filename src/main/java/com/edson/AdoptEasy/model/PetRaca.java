package com.edson.AdoptEasy.model;

public class PetRaca {
    private int id;
    private String raca;
    private boolean ativo;

    public PetRaca(int id, String raca, boolean ativo) {
        super();
        this.id = id;
        this.raca = raca;
        this.ativo = ativo;
    }

    public PetRaca() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
