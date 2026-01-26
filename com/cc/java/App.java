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
        output("Blick von aussen: " + cat);
        output("Blick von innen: " + cat.getInstanceVariable());
        // cat.sayHello();
        output("-------------------------------");

        Cat cat2 = new Cat();  // default - Konstruktor
        output("Blick von aussen: " + cat2);
        output("Blick von innen: " + cat2.getInstanceVariable());
        // cat2.sayHello();
        output("-------------------------------");

    }

    public static void output(String outputStr){
        System.out.println(outputStr);
    }

}



