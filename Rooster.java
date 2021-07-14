package com.singtel.bird;

import com.singtel.Parrot;
import com.singtel.animal.Animal;

public class Rooster extends Animal implements Parrot  {
    public void makeSound(){
        System.out.println("Cock-a-doodle-doo ");
    }
}
