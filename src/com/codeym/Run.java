package com.codeym;

public class Run {
    public static void main(String[] args) {
        Car car1 = new Car("mazda 3", "sky active 3");
        System.out.println("model" + car1.getModel() + " engine :" + car1.getEngine() + "num of car : " + Car.numOfCar);
        Car car2 = new Car("mazda 6", "sky active 6");
        System.out.println("model" + car2.getModel() + " engine :" + car2.getEngine() + "num of car : " + Car.numOfCar);
    }
}
