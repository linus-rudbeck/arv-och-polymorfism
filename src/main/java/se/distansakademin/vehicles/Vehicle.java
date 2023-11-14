package se.distansakademin.vehicles;

public class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public String getFeatures(){
        return "My " + brand + " is traveling at " + speed + " km/h";
    }
}
