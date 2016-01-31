//Holds quantity and unit together.

public class Measurement {
    private final double quantity;
    private final MeasurementUnit unit;

    public Measurement(double quantity, MeasurementUnit unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public static Measurement inch(double value) {
        return new Measurement(value, MeasurementUnit.INCH);
    }

    public static Measurement foot(double value) {
        return new Measurement(value, MeasurementUnit.FOOT);
    }

    public static Measurement centimeter(double value) {
        return new Measurement(value, MeasurementUnit.CENTIMETER);
    }

    public static Measurement litre(double value) {
        return new Measurement(value, MeasurementUnit.LITRE);
    }

    private double baseValue() {
        return this.unit.baseValue(this.quantity);
    }

    @Override
    public boolean equals(Object other) {

        if (this == other) return true;

        if ((other == null) || other.getClass() != getClass()) return false;

        final Measurement otherQuantity = ((Measurement) other);
        return baseValue() == otherQuantity.baseValue();

//        if (Double.compare(otherQuantity.quantity, quantity) != 0) return false;
//        if (unit != null ? !unit.equals(otherQuantity.unit) : otherQuantity.unit != null) return false;

    }

    @Override
    public String toString() {
        return "Quantity{" +
                "quantity=" + quantity +
                ", unit=" + unit +
                '}';
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(quantity);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }
}
