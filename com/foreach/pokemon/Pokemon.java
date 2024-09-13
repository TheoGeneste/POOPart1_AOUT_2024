package com.foreach.pokemon;

import java.util.Random;

public class Pokemon {
    private String nom;
    private int pv;
    private int niveau;
    private boolean isKO;

    public Pokemon(String nom, int pv, int niveau) {
        this.nom = nom;
        this.pv = pv;
        this.niveau = niveau;
        this.isKO = false;
    }


    
    public int getPv() {
        return pv;
    }

    public boolean getIsKo(){
        return isKO;
    }


    public void setPv(int pv) {
        this.pv = pv;
    }



    public void cri(){
        System.out.println("Je suis un Pokemon");
    }

    public void attaque(Pokemon adversaire){
        Random random = new Random();
        int degats = (random.nextInt(10) + 1) * niveau;
        adversaire.setPv(adversaire.getPv() - degats);
        System.out.println(this.nom + " inflige " + degats + " a " + adversaire.nom);
        if (adversaire.pv <= 0) {
            adversaire.isKO = true;
            System.out.println(adversaire.nom + " est hors de combat");
        }else{
            System.out.println("Pv Restant de " + adversaire.nom + " => " + adversaire.pv);
        }
    }
    
}
