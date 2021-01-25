import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer1;
    Printer printer2;

    @Before
    public void before(){
        printer1 = new Printer(150, 100);
        printer2 = new Printer(10, 5);
    }

    @Test
    public void hasPaper(){
        assertEquals(150, printer1.getTotalPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer1.getToner());
    }

    @Test
    public void printIfEnoughPaper(){
        printer1.print(10, 3);
        assertEquals(120, printer1.getTotalPaper());
    }

    @Test
    public void cantPrintIfNotEnoughPaper(){
        printer2.print(10, 3);
        assertEquals(10, printer2.getTotalPaper());
    }

    @Test
    public void canReduceToner(){
        printer1.print(10, 3);
        assertEquals(70, printer1.getToner());
    }

    @Test
    public void cantReduceToner(){
        printer2.print(10, 3);
        assertEquals(5, printer2.getToner());
    }
}
