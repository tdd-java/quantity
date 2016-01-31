import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MeasurementTest {
    @Test
    public void shouldReturnTrueWhenComparing12Inchand1Foot(){
        Measurement twelveInch = Measurement.inch(12);
        Measurement oneFoot = Measurement.foot(1);
        assertTrue(twelveInch.equals(oneFoot));
    }

    @Test
    public void shouldReturnTrueWhenComparing30CentimeterAnd1Foot(){
        Measurement thirtyCentimeter = Measurement.centimeter(30.48);
        Measurement oneFoot = Measurement.foot(1);
        assertTrue(thirtyCentimeter.equals(oneFoot));
    }

    @Test
    public void testFalse(){
        Measurement oneInch = Measurement.inch(1);
        Measurement twoCentimeter = Measurement.centimeter(12);
        assertFalse(oneInch.equals(twoCentimeter));
    }

    @Test
    public void checkVolumeEquality(){
//        Measurement oneLitre = Measurement.litre(1);
    }
}
