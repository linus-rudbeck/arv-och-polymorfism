import org.junit.jupiter.api.Test;
import se.distansakademin.vehicles.Car;
import se.distansakademin.vehicles.Motorcycle;
import se.distansakademin.vehicles.Vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTests {

    @Test
    public void testGetFeatures() {
        var brand = "lamborghini";
        var speed = 300;
        var vehicle = new Vehicle(brand, speed);

        var expected = "My " + brand + " is traveling at " + speed + " km/h";
        var actual = vehicle.getFeatures();

        assertEquals(expected, actual);
    }

    @Test
    public void testPolymorphism(){
        var brand = "lamborghini";
        var speed = 300;
        Car car = new Car(brand, speed, 4);
        Motorcycle mc = new Motorcycle(brand, speed, true);

        var expected = "My " + brand + " is traveling at " + speed + " km/h";
        Vehicle[] vehicles = { car, mc };

        for(Vehicle v : vehicles){
            assertEquals(expected, v.getFeatures());

            // Lika bra:
            var actual = v.getFeatures();
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testAccelerateVehicle(){
        var vehicle = new Vehicle("Bose", 0);
        vehicle.accelerate();

        var expected = 5;
        var actual = vehicle.getSpeed();

        assertEquals(expected, actual);
    }
}
