package com.singtel;

import com.singtel.animal.Animal;
import com.singtel.bird.Bird;
import com.singtel.bird.Chicken;
import com.singtel.swimmers.Swimmable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalCountAPI {
    public Map<String,Integer> getAnimalCount(List<Animal> animal){
        int flyCount=0;
        int walkCount = 0;
        int singCount=0;
        int swimCount=0;
        Map<String, Integer> countMap = new HashMap<>();
        for(Animal a : animal){
            if(a instanceof Bird){
                if(!(a instanceof Chicken)) {
                    flyCount += 1;
                }
                singCount+=1;
            }
            else if(a instanceof Animal && !(a instanceof Swimmable) && !(a instanceof Bird)){

                walkCount+=1;
            }
            else if(a instanceof Swimmable){
                swimCount+=1;
            }
        }
        countMap.put("walkCount",walkCount);
        countMap.put("flyCount",flyCount);
        countMap.put("singCount",singCount);
        countMap.put("swimCount",swimCount);

        return countMap;
    }
}
