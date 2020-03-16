package com.quantitymeasurement;

public enum Conversion {
    FEET(1), INCH(1), FEET_TO_INCH(1 * 12), INCH_TO_FEET(1 / 12);

    public int unitValue;

    Conversion(int unitValue) {
        this.unitValue = unitValue;
    }
}
