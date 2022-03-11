package com.company;

public class Car {
    private int id;
    private int numberOfCar;

    public Car(){

    }
    public Car(int id, int numberOfCar){
        this.id = id;
        this.numberOfCar = numberOfCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(int numberOfCar) {
        this.numberOfCar = numberOfCar;
    }

    @Override
    public String toString() {
        return "Car: " +
                "\nid: " + id +
                "\nnumberOfCar: " + numberOfCar;
    }
}
