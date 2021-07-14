package com.singtel;

import com.singtel.animal.Animal;
import com.singtel.animal.Cat;
import com.singtel.animal.Dog;
import com.singtel.behavioural.Butterfly;
import com.singtel.bird.Bird;
import com.singtel.bird.Chicken;
import com.singtel.bird.Duck;
import com.singtel.bird.Rooster;
import com.singtel.swimmers.ClownFish;
import com.singtel.swimmers.Dolphins;
import com.singtel.swimmers.Fish;
import com.singtel.swimmers.Shark;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        Fish shark = new Shark();
        Fish clownFish = new ClownFish();
        shark.setSize("small");
        shark.setColor("grey");
        clownFish.setColor("Orange");
        clownFish.setSize("small");

        Bird butterFly = new Butterfly();
        butterFly.fly();
        butterFly.sing();

        List<Animal> animals = new ArrayList<>(); {
                animals.add(new Bird());
            animals.add(new Bird());
            animals.add(new Duck());
            animals.add(new Chicken());
            animals.add(new Rooster());
            animals.add(new Fish());
            animals.add(new Shark());
            animals.add(new ClownFish());
            animals.add(new Dolphins());
            animals.add(new Dog());
            animals.add(new Butterfly());
            animals.add(new Cat());
        };
        AnimalCountAPI animalCountAPI = new AnimalCountAPI();
        Map<String, Integer> result = animalCountAPI.getAnimalCount(animals);
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
