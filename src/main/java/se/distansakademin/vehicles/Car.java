package se.distansakademin.vehicles;

import se.distansakademin.vehicles.Vehicle;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public String getCarInfo(){
        String features = getFeatures();
        return features + " and has " + numberOfDoors + " doors";
    }

    @Override
    public void accelerate(){
        speed += 10;
    }
}
