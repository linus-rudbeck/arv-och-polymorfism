import org.junit.jupiter.api.Test;
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
}
