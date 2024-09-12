package com.foreach.poo;

import java.util.ArrayList;
import java.util.List;

public class Developpeur extends Person{
    private List<String> languages = new ArrayList<>();
    
    public Developpeur(String firstName, String lastName, int age, List<String> languages) {
        super(firstName, lastName, age);
        this.languages = languages;
    }
    

    public void afficherLanguage(){
        for (String  lang: this.languages) {
            System.out.println(lang);
        }
    }

    @Override
    public void sePresenter(){
        System.out.println("Je m\'appelle " + this.getFirstName() + " " + this.getLastName() + " et j\'ai " + this.getAge() + " ans et je suis Développeur");
    }
}
