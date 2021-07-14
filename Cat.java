package com.singtel.animal;

import com.singtel.Parrot;

public class Cat extends Animal implements Parrot {
    public void makeSound(){
        System.out.println("me ow");
    }
}
