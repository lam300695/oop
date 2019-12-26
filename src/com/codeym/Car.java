package com.codeym;

public class Car {
    private String model;
    private String engine;

    public static int numOfCar;

    public Car() {
    }

    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
        numOfCar ++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

}
