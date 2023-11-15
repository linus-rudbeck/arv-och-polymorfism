package se.distansakademin;

import se.distansakademin.vehicles.Car;
import se.distansakademin.vehicles.Motorcycle;
import se.distansakademin.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var myCar = new Car("Volvo", 240, 4);
        var carInfo = myCar.getCarInfo();
        System.out.println(carInfo);

        polymorphismDemo();
    }

    private static void polymorphismDemo() {
        // Create empty list of Vehicles
        List<Vehicle> vehicleList = new ArrayList<>();

        Random random = new Random();

        // Loop 10x:
        for (int i = 0; i < 10; i++) {
            // Generate random number from 1-100
            int randomNumber = random.nextInt(1, 100);

            // If random number is < 50: Create MC
            if(randomNumber < 50){
                Motorcycle mc = new Motorcycle("BMW", 350, true);
                vehicleList.add(mc); // Save MC / Car in list of Vehicles
            }
            // Otherwise: Create Car
            else{
                Car car = new Car("Honda", 80, 4);
                vehicleList.add(car); // Save MC / Car in list of Vehicles
            }
        }

        // In another loop (foreach-loop):
        for(Vehicle vehicle : vehicleList){
            System.out.println(vehicle.getFeatures());
        }
        // Get and print vehicle features
    }
}