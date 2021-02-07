package com.company;

public class Plate {
    private static int food;

    public Plate(int food) {
        this.food = food;
    }

    public void printFood ()
    {
        System.out.println("Food in plate: " + food);
    }

    public boolean decreaseFood (Cat cat) {
        System.out.print(cat.getName() + " с аппетитом " + cat.getAppetite() + " подходит к миске и ...");
        if (food < cat.getAppetite()) {
            System.out.print("В тарелке еды " + food + " - недостаточно для насыщения " + cat.getName() + ".");
            return false;
        }
        else {
            food -= cat.getAppetite();
            return true;
        }
    }

    public void putFoodInPlate (int food) {
        this.food += food;
    }
}
