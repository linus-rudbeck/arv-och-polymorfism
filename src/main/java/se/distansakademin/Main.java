package se.distansakademin;

import se.distansakademin.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        var myCar = new Car("Volvo", 240, 4);
        var carInfo = myCar.getCarInfo();
        System.out.println(carInfo);
    }
}