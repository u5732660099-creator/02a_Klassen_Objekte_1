package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /*
       *    1. Iteration
       *    Instanziierung  --> 
       *    Erzeugen eines Objektes durch Aufruf eines Konstruktors
       *    Objekt <---> Instanz
       *    cat --> Referenzvariable
       *    Cat --> Referenztyp(Klasse)
       * 
       */

        Cat cat = new Cat();  // default - Konstruktor
        System.out.println("Blick von aussen: " + cat);
        cat.sayHello();
        System.out.println("-------------------------------");

        Cat cat2 = new Cat();  // default - Konstruktor
        System.out.println("Blick von aussen: " + cat2);
        cat2.sayHello();
        System.out.println("-------------------------------");



    }



    

}

