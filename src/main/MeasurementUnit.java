//While creating unit, it specifies value in base unit

public class MeasurementUnit {

    public static final double BASE_VALUE_FOR_FOOT = 12;
    public static final double BASE_VALUE_FOR_CENTIMETER = 0.39;

    private final double baseValueForUnit;

    private MeasurementUnit(double baseValueForUnit) {
        this.baseValueForUnit = baseValueForUnit;
    }

    public static final MeasurementUnit INCH = new MeasurementUnit(1);
    public static final MeasurementUnit FOOT = new MeasurementUnit(BASE_VALUE_FOR_FOOT);
    public static final MeasurementUnit CENTIMETER = new MeasurementUnit(BASE_VALUE_FOR_CENTIMETER);

    public static final MeasurementUnit LITRE = new MeasurementUnit(1000);


    public double baseValue(double value) {
        return Math.round(value * baseValueForUnit);
    }
}
