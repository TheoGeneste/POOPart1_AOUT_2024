package com.foreach.pokemon;

import java.util.ArrayList;
import java.util.List;

public class Dresseur {
    private String nom;
    private List<Pokemon> equipes = new ArrayList<>();
    private boolean isKO;

    public Dresseur(String nom) {
        this.nom = nom;
        this.equipes = new ArrayList<>();
        this.isKO = false;
    }

    public String getNom(){
        return nom;
    }
    public boolean getIsKo(){
        return isKO;
    }

    public List<Pokemon> getEquipes(){
        return equipes;
    }

    public void addPokemon(Pokemon pokemon) {
        equipes.add(pokemon);
    }

    public boolean isOut(){
        isKO = true;
        for (Pokemon pokemon : equipes) {
            if (!pokemon.getIsKo()) {
                isKO = false;
                break;
            }
        }
        return isKO;
    }
}
