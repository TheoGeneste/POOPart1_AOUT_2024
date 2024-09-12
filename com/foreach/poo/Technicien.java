package com.foreach.poo;

import java.util.ArrayList;
import java.util.List;

public class Technicien extends Person {
    private List<String> technos = new ArrayList<>();
    
    
    public Technicien(String firstName, String lastName, int age, List<String> technos) {
        super(firstName, lastName, age);
        this.technos = technos;
    }
    
}
