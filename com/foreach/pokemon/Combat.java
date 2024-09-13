package com.foreach.pokemon;

public class Combat {

    public void combat(Dresseur dresseur1, Dresseur dresseur2){
        int indexDresseur1 = 0;
        int indexDresseur2 = 0;
        while (!dresseur1.getIsKo() && !dresseur2.getIsKo()) {
            System.out.println(indexDresseur1);
            System.out.println(indexDresseur2);
            dresseur1.getEquipes().get(indexDresseur1).attaque(dresseur2.getEquipes().get(indexDresseur2));
            if (dresseur2.getEquipes().get(indexDresseur2).getIsKo()) {
                indexDresseur2++;
                dresseur2.isOut();
                if (dresseur2.getIsKo()) {
                    System.out.println("Dresseur " + dresseur1.getNom() + " sort vainqueur de ce combat!");
                    break;
                }
            }
            dresseur2.getEquipes().get(indexDresseur2).attaque(dresseur1.getEquipes().get(indexDresseur1));
            if (dresseur1.getEquipes().get(indexDresseur1).getIsKo()) {
                indexDresseur1++;
                dresseur1.isOut();
                if (dresseur1.getIsKo()) {
                    System.out.println("Dresseur " + dresseur2.getNom() + " sort vainqueur de ce combat!");
                    break;
                }
            }
        }
        
    }
}
