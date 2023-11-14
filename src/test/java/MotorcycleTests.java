import org.junit.jupiter.api.Test;
import se.distansakademin.vehicles.Motorcycle;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MotorcycleTests {

    @Test
    public void testGetMotorcycleInfoHasSidecar(){
        var brand = "Honda";
        var speed = 20;
        var hasSidecar = true;
        var motorcycle = new Motorcycle(brand, speed, hasSidecar);

        var expected = "My " + brand + " is traveling at " + speed + " km/h "
                + "and has sidecar";
        var actual = motorcycle.getMotorcycleInfo();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetMotorcycleInfoNoSidecar(){
        var brand = "Honda";
        var speed = 20;
        var hasSidecar = false;
        var motorcycle = new Motorcycle(brand, speed, hasSidecar);

        var expected = "My " + brand + " is traveling at " + speed + " km/h "
                + "and has no sidecar";
        var actual = motorcycle.getMotorcycleInfo();

        assertEquals(expected, actual);
    }
}
