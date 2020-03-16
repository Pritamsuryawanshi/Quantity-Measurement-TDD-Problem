package com.quantitymeasurement;

public class QuantityMeasurement {
    public int valueOne;
    public int valueTwo;

    public QuantityMeasurement() {

    }
    public QuantityMeasurement(int valueOne, int valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public boolean calculatingMeasurements(int paramOne, int paramTwo) {
        if (paramOne == paramTwo)
            return true;
        return false;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!(object instanceof QuantityMeasurement))
            return false;
        return true;
    }

    public boolean referenceCheck(QuantityMeasurement object) {
        if (object == this)
            return true;
        return false;
    }

    public boolean typeCheck(QuantityMeasurement object) {
        if (object.getClass() == this.getClass())
            return true;
        return false;
    }
}