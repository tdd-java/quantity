import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class QuantityTest {
    @Test
    public void shouldReturnTrueWhenComparing12Inchand1Foot(){
        Quantity twelveInch =Quantity.inch(12);
        Quantity oneFoot = Quantity.foot(1);
        assertTrue(twelveInch.equals(oneFoot));
    }

    @Test
    public void shouldReturnTrueWhenComparing30CentimeterAnd1Foot(){
        Quantity thirtyCentimeter =Quantity.centimeter(30.48);
        Quantity oneFoot = Quantity.foot(1);
        assertTrue(thirtyCentimeter.equals(oneFoot));
    }
}
