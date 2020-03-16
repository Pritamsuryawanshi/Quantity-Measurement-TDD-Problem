package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    private QuantityMeasurementForFeet objectForFeet;
    private QuantityMeasurementForInch objectForInch;

    @Before
    public void QuantityMeasurement() {
        objectForFeet = new QuantityMeasurementForFeet();
        objectForInch = new QuantityMeasurementForInch();
    }

    @Test
    public void givenTwoUnit_IfEqual_ShouldReturnTrue() {
        boolean result = objectForFeet.calculatingMeasurements(0, 0);
        Assert.assertTrue(result);
    }


    @Test
    public void givenObject_IfNotNull_ShouldReturnFalse() {
        boolean result = objectForFeet.equals(null);
        Assert.assertFalse(result);
    }


    @Test
    public void givenObject_IfMatchesTheReference_ShouldReturnFalse() {
        boolean result = objectForFeet.referenceCheck(objectForFeet);
        Assert.assertTrue(result);
    }

    @Test
    public void givenObject_IfMatchesTheType_ShouldReturnFalse() {
        boolean result = objectForFeet.typeCheck(objectForFeet);
        Assert.assertTrue(result);
    }

    @Test
    public void givenObjects_IfMatchesTheirValues_ShouldReturnFalse() {
        QuantityMeasurementForFeet objectOne = new QuantityMeasurementForFeet(5, 10);
        QuantityMeasurementForFeet objectTwo = new QuantityMeasurementForFeet(5, 10);
        Assert.assertEquals(objectOne.valueOne, objectTwo.valueOne);
    }

    @Test
    public void givenTwoValuesInInch_IfEqual_ShouldReturnTrue() {
        boolean result = objectForInch.calculatingMeasurements(0, 0);
        Assert.assertTrue(result);
    }

    @Test
    public void givenObjectForInch_IfNotNull_ShouldReturnFalse() {
        boolean result = objectForInch.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenObjectForInch_IfMatchesTheReference_ShouldReturnFalse() {
        boolean result = objectForInch.referenceCheck(objectForInch);
        Assert.assertTrue(result);
    }

    @Test
    public void givenObjectForInch_IfMatchesTheType_ShouldReturnFalse() {
        boolean result = objectForInch.typeCheck(objectForInch);
        Assert.assertTrue(result);
    }
}
