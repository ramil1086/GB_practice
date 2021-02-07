package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cat[] catsArray = new Cat[5];
        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i] = new Cat("Кот" + i, (int) (Math.random()*10));
        }

        Plate plate = new Plate(10);
        plate.putFoodInPlate(10);
        plate.printFood();
        for (Cat cat : catsArray) {
            cat.eat(plate);
        }
    }
}
