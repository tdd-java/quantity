//While creating unit, it specifies value in base unit

public class MeasurementUnit {

    private final double baseValueInInch;

    private MeasurementUnit(double baseValueInInch) {
        this.baseValueInInch = baseValueInInch;
    }

    public static final MeasurementUnit INCH = new MeasurementUnit(1);

    public static final MeasurementUnit FOOT = new MeasurementUnit(12);

    public static final MeasurementUnit CENTIMETER = new MeasurementUnit(0.39);


    public double baseValue(double value) {
        return Math.round(value * baseValueInInch);
    }
}
