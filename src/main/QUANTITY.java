public class Quantity {
    private final double quantity;
    private final MeasurementUnit unit;

    public Quantity(double quantity, MeasurementUnit unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public static Quantity inch(double value) {
        return new Quantity(value, MeasurementUnit.INCH);
    }

    public static Quantity foot(double value) {
        return new Quantity(value, MeasurementUnit.FOOT);
    }

    public static Quantity centimeter(double value) {
        return new Quantity(value, MeasurementUnit.CENTIMETER);
    }

    private double baseValue() {
        return this.unit.baseValue(this.quantity);
    }

    @Override
    public boolean equals(Object other) {

        if (this == other) return true;

        if ((other == null) || other.getClass() != getClass()) return false;

        final Quantity otherQuantity = ((Quantity) other);
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
