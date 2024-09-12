package com.foreach.poo;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private List<Person> persons = new ArrayList<>();
    private String projet;
    private String chef;

    public Equipe() {
    }

    public Equipe(List<Person> persons) {
        this.persons = persons;
    }

    public Equipe(String projet) {
        this.projet = projet;
    }

    public Equipe(List<Person> persons, String projet) {
        this.persons = persons;
        this.projet = projet;
    }

    public void addPerson(Person person){
        this.persons.add(person);
    }

    public void removePerson(Person person){
        this.persons.remove(person);
    }

    public void presenterEquipe(){
        for (Person person : persons) {
            person.sePresenter();
        }
    }
}   
