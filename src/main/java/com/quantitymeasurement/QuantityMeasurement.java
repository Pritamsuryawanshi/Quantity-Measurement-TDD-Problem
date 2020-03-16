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


    public double conversion(int valueOne, Conversion conversion) {
        return valueOne * conversion.unitValue;
    }

    public double addition(int unitOne, int unitTwo, Conversion conversion) {
        return unitOne*conversion.unitValue+unitTwo*conversion.unitValue;
    }
}
