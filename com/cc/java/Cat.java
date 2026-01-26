package com.cc.java;

public class Cat {

    public void sayHello(){
        // System.out.println("Meow");
        // --> Instanzvariable
        // System.out.println("Blick von innen: " + this);
         App.output("Blick von innen: " + this);
    }

   public Cat getInstanceVariable(){
         return this;
   }


}
