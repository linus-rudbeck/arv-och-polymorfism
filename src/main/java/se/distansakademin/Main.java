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
        overrideDemo();
        overloadDemo();
    }

    private static void overloadDemo() {
        System.out.println("\n---- Overload ----");

        Calculator calc = new Calculator();

        System.out.println("Add two ints: " + calc.add(1,2));
        System.out.println("Add three ints: " + calc.add(1,2, 3));
        System.out.println("Add two doubles: " + calc.add(13.0, 0.4));
    }

    private static void overrideDemo() {
        System.out.println("\n---- Override ----");
        Vehicle vehicle = new Vehicle("Bussen", 25);
        Car car = new Car("Bilen", 25, 5);
        Motorcycle mc = new Motorcycle("Motorcykeln", 25, false);

        vehicle.accelerate();
        car.accelerate();
        mc.accelerate();

        System.out.println(vehicle.getFeatures());
        System.out.println(car.getFeatures());
        System.out.println(mc.getFeatures());
    }

    private static void polymorphismDemo() {
        System.out.println("\n---- Polymorphism ---");
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