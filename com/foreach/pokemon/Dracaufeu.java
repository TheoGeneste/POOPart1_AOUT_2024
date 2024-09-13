package com.foreach.pokemon;

public class Dracaufeu extends Pokemon {

    public Dracaufeu(String nom , int pv, int niveau) {
        super(nom, pv, niveau);
    }

    @Override
    public void cri(){
        System.out.println("Dracaufeuu !!!!");
    }
    
}
