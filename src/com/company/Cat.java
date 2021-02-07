package com.company;

public class Cat  {
    private String name;
    private int appetite;
    private boolean foolness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat (Plate plate) {
        foolness = plate.decreaseFood(this);
        System.out.println(name + " - cытость равна " + foolness);


    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFoolness() {
        return foolness;
    }

}
