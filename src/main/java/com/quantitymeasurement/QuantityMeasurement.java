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


    public double conversion(double valueOne, Conversion conversion) {
        return valueOne * conversion.unitValue;
    }

    public double addition(double unitOne, double unitTwo, Conversion conversion) {
        return unitOne+unitTwo;
    }
}
