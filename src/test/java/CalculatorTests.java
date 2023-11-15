import org.junit.jupiter.api.Test;
import se.distansakademin.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTests {
    @Test
    public void testAddTwoInts(){
        var calc = new Calculator();

        var expected = 5;
        var actual = calc.add(2, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testAddThreeInts(){
        var calc = new Calculator();

        var expected = 6;
        var actual = calc.add(1,2,3);

        assertEquals(expected, actual);
    }

    @Test
    public void testAddTwoDoubles(){
        var calc = new Calculator();

        var expected = 3.1415;
        var actual = calc.add(3.1010, 0.0405);

        assertEquals(expected, actual);
    }
}
