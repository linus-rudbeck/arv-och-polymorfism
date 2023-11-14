import org.junit.jupiter.api.Test;
import se.distansakademin.vehicles.Car;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CarTests {

    @Test
    public void testGetCarInfo(){
        var brand = "Lamborghini";
        var speed = 300;
        var numberOfDoors = 3;
        var car = new Car(brand, speed, numberOfDoors);

        var expected = "My " + brand + " is traveling at " + speed + " km/h "
                + "and has " + numberOfDoors + " doors";
        var actual = car.getCarInfo();

        assertEquals(expected, actual);
    }
}
