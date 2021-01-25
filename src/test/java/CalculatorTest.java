import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(7, 6);
    }

    @Test
    public void canAdd(){
        assertEquals(13, calculator.Add());
    }

    @Test
    public void canSubtract(){
        assertEquals(1, calculator.Subtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(42, calculator.Multiply());
    }

    @Test
    public void canDivide(){
        assertEquals(1, calculator.Divide(), 0.0);
    }
}
