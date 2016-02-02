//While creating unit, it specifies value in base unit

public class MeasurementUnit {

    public static final double BASE_VALUE_FOR_FOOT = 12;
    public static final double BASE_VALUE_FOR_CENTIMETER = 0.39;
    public static final double BASE_VALUE_FOR_INCH = 1;
    public static final double BASE_VALUE_FOR_LITRE = 1000;
    public static final double BASE_VALUE_FOR_MILILITRE = 1;

    private final double baseValueForUnit;
    private final Object type;

    private MeasurementUnit(double baseValueForUnit, Object type) {
        this.baseValueForUnit = baseValueForUnit;
        this.type = type;
    }

    private static Object VOLUME;
    private static Object LENGTH;
    public static final MeasurementUnit INCH = new MeasurementUnit(BASE_VALUE_FOR_INCH, LENGTH);

    public static final MeasurementUnit FOOT = new MeasurementUnit(BASE_VALUE_FOR_FOOT, LENGTH);
    public static final MeasurementUnit CENTIMETER = new MeasurementUnit(BASE_VALUE_FOR_CENTIMETER, LENGTH);
    public static final MeasurementUnit LITRE = new MeasurementUnit(BASE_VALUE_FOR_LITRE, VOLUME);
    public static final MeasurementUnit MILILITRE = new MeasurementUnit(BASE_VALUE_FOR_MILILITRE, VOLUME);


    public double baseValue(double value) {
        return Math.round(value * baseValueForUnit);
    }
}
