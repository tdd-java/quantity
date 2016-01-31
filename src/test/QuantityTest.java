import org.junit.Test;

public class QuantityTest {
    @Test
    public void shouldReturnTrueWhenComparing12Inchand1Foot(){
        Quantity twelveInch = new Quantity(12, MeasurementUnit.INCH);
        Quantity oneFoot = new Quantity(1, MeasurementUnit.FOOT);
    }
}
