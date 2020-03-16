package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    private QuantityMeasurement object;

    @Before
    public void QuantityMeasurement() {
        object = new QuantityMeasurement();
    }

    @Test
    public void givenTwoUnit_IfEqual_ShouldReturnTrue() {
        boolean result = object.calculatingMeasurements(0, 0);
        Assert.assertTrue(result);
    }

    @Test
    public void givenObject_IfNotNull_ShouldReturnFalse() {
        boolean result = object.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenObject_IfMatchesTheReference_ShouldReturnFalse() {
        boolean result = object.referenceCheck(object);
        Assert.assertTrue(result);
    }

    @Test
    public void givenObject_IfMatchesTheType_ShouldReturnFalse() {
        boolean result = object.typeCheck(object);
        Assert.assertTrue(result);
    }
}
