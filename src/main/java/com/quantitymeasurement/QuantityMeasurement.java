package com.quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurement {

    public int valueOne;
    public int valueTwo;

    public QuantityMeasurement(int valueOne, int valueTwo) {    
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public QuantityMeasurement() {
    }

    public double conversion(double valueOne, Conversion conversion) {
        return valueOne * conversion.unitValue;
    }

    public double farenheitToCelsius(int Farenheit) {
        return (Farenheit - 32) * 5 / 9;
    }

    public double addition(double unitOne, double unitTwo) {
        return unitOne + unitTwo;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null)
            return false;
        if (!(object instanceof QuantityMeasurement))
            return false;
        return true;
    }
}
