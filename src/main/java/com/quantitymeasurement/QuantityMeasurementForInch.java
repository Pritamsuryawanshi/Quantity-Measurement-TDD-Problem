package com.quantitymeasurement;

public class QuantityMeasurementForInch {

    public int valueOne;
    public int valueTwo;

    public QuantityMeasurementForInch(int valueOne, int valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;

    }

    public QuantityMeasurementForInch() {
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
        if (!(object instanceof QuantityMeasurementForInch))
            return false;
        return true;
    }

    public boolean referenceCheck(QuantityMeasurementForInch objectForInch) {
        if (objectForInch == this)
            return true;
        return false;
    }

    public boolean typeCheck(QuantityMeasurementForInch objectForInch) {
        if (objectForInch.getClass() == this.getClass())
            return true;
        return false;
    }
}
