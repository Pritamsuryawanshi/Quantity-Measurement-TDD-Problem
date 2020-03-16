package com.quantitymeasurement;

public class QuantityMeasurementForFeet {
    public int valueOne;
    public int valueTwo;

    public QuantityMeasurementForFeet() {

    }
    public QuantityMeasurementForFeet(int valueOne, int valueTwo) {
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
        if (!(object instanceof QuantityMeasurementForFeet))
            return false;
        return true;
    }

    public boolean referenceCheck(QuantityMeasurementForFeet object) {
        if (object == this)
            return true;
        return false;
    }

    public boolean typeCheck(QuantityMeasurementForFeet object) {
        if (object.getClass() == this.getClass())
            return true;
        return false;
    }
}