package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Car, CarInformation> car = new HashMap<>(Map.of(
                new Car(12345,654), new CarInformation(21012009, "Toyota", 20000, "white"),
                new Car(87659,194), new CarInformation(30042019, "Toyota", 50000, "black"),
                new Car(34565,608), new CarInformation(11072020, "Mazda", 10000, "grey"),
                new Car(89065,567), new CarInformation(14052018, "Hyundai", 15000, "red"),
                new Car(78963,100), new CarInformation(13052021, "Mercedes", 60000, "white")));


        for (HashMap.Entry a: car.entrySet()) {
            System.out.println(a.getKey() + " " + a.getValue());
            
        }
    }
}
