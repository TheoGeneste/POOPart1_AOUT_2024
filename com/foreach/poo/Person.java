package com.foreach.poo;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    private  String securiteSociale;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    

    public void sePresenter(){
        System.out.println("Je m\'appelle " + this.firstName + " " + this.lastName + " et j\'ai " + this.age + " ans");
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public int getAge() {
        return age;
    }
    
}
