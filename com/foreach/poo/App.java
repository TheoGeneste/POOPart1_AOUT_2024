package com.foreach.poo;

import java.util.ArrayList;
import java.util.List;

public class App{

    public static void main(String[] args) {
        List<String> language = new ArrayList<>();
        List<String> techno = new ArrayList<>();
        techno.add("CISCO");
        techno.add("NETGEAR");
        language.add("PHP");
        language.add("JAVA");
        Developpeur person = new Developpeur("Théo", "BIALASIK", 23, language);
        Person person2 = new Developpeur("Pierre", "STAWIKOWSKI", 30, language);
        Technicien tech1 = new Technicien("Toto", "Toto", 35, techno);

        // person.sePresenter();
        // person2.sePresenter();
        // tech1.sePresenter();

        // person.afficherLanguage();

        Equipe equipe1 = new Equipe(new ArrayList<>());
        Equipe equipe2 = new Equipe();
        equipe1.addPerson(person);
        equipe1.addPerson(person2);
        equipe1.addPerson(tech1);

        equipe1.removePerson(person2);
        equipe1.presenterEquipe();

    }
    
}