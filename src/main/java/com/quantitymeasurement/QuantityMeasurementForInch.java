package com.quantitymeasurement;

public class QuantityMeasurementForInch {

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

    public boolean referenceCheck(QuantityMeasurementForInch objectForFeet) {
        if (objectForFeet == this)
            return true;
        return false;
    }
}
