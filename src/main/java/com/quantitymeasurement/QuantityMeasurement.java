package com.quantitymeasurement;

public class QuantityMeasurement {

    public int valueOne;
    public int valueTwo;

    public QuantityMeasurement(int valueOne, int valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;

    }
    public QuantityMeasurement() {
    }

    public boolean comparingValues(int paramOne, int paramTwo) {
        if (paramOne  == paramTwo )
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

    public boolean referenceCheck(QuantityMeasurement objectForInch) {
        if (objectForInch == this)
            return true;
        return false;
    }

    public double conversion(int valueOne,Conversion conversion) {
        return valueOne * conversion.unitValue;
    }
}
