package com.singtel.animal;

import com.singtel.Parrot;

public class Dog extends Animal implements Parrot {

    public void makeSound(){
        System.out.println("woof woof...");
    }
}
