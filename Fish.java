package com.singtel.swimmers;

import com.singtel.animal.Animal;

public class Fish extends Animal implements Swimmable{
    private String size;
    private String color;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void swim(){
        System.out.println("I'm Swimming");
    }
}
