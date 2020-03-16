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
        boolean result = object.comparingFeetValues(0, 0);
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

    @Test
    public void givenObjects_IfMatchesTheirValues_ShouldReturnFalse() {
        QuantityMeasurement objectOne = new QuantityMeasurement(5, 10);
        QuantityMeasurement objectTwo = new QuantityMeasurement(5, 10);
        Assert.assertEquals(objectOne.valueOne, objectTwo.valueOne);
    }

    @Test
    public void givenTwoValuesInInch_IfEqual_ShouldReturnTrue() {
        boolean result = object.comparingInchValues(0, 0);
        Assert.assertTrue(result);
    }

    @Test
    public void givenObjectForInch_IfNotNull_ShouldReturnFalse() {
        boolean result = object.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenObjectForInch_IfMatchesTheReference_ShouldReturnFalse() {
        boolean result = object.referenceCheck(object);
        Assert.assertTrue(result);
    }

    @Test
    public void givenObjectForInch_IfMatchesTheType_ShouldReturnFalse() {
        boolean result = object.typeCheck(object);
        Assert.assertTrue(result);
    }

    @Test
    public void givenObjectsFor_IfMatchesTheirValues_ShouldReturnFalse() {
        QuantityMeasurement objectOne = new QuantityMeasurement(5, 10);
        QuantityMeasurement objectTwo = new QuantityMeasurement(5, 10);
        Assert.assertEquals(objectOne.valueOne, objectTwo.valueOne);
    }
}
