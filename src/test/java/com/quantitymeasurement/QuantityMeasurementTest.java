package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

public class QuantityMeasurementTest {

    private QuantityMeasurement object;

    @Before
    public void QuantityMeasurement() {
        object = new QuantityMeasurement();
    }

    @Test
    public void givenTwoValuesInFeet_IfEqual_ShouldReturnTrue() {
        boolean result = object.comparingValues(0, 0);
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
        boolean result = Objects.equals(object.getClass(), QuantityMeasurement.class);
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
        boolean result = object.comparingValues(0, 0);
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
        boolean result = object.getClass().equals(QuantityMeasurement.class);
        Assert.assertTrue(result);
    }

    @Test
    public void givenObjectsFor_IfMatchesTheirValues_ShouldReturnFalse() {
        QuantityMeasurement objectOne = new QuantityMeasurement(5, 10);
        QuantityMeasurement objectTwo = new QuantityMeasurement(5, 10);
        Assert.assertEquals(objectOne.valueOne, objectTwo.valueOne);
    }

    @Test
    public void givenLengthInFeet_IfNotEqualInInch_ShouldReturnConversion() {
        double result = object.conversion(1, Conversion.FEET_TO_INCH);
        Assert.assertNotEquals(1, result);
    }

    @Test
    public void givenLengthInInch_IfNotEqualInInch_ShouldReturnConversion() {
        double result = object.conversion(1, Conversion.INCH_TO_FEET);
        Assert.assertNotEquals(1, result);
    }

    @Test
    public void givenLengthInFeet_IfEqualsInInch_ShouldReturnConversion() {
        double result = object.conversion(1, Conversion.FEET_TO_INCH);
        Assert.assertNotEquals(12, result);
    }

    @Test
    public void givenLengthInInch_IfEqualsInFeet_ShouldReturnConversion() {
        double result = object.conversion(12, Conversion.FEET_TO_INCH);
        Assert.assertNotEquals(1, result);
    }

    @Test
    public void givenLengthInFeet_IfEqualsInYard_ShouldReturnConversion() {
        double result = object.conversion(3, Conversion.FEET_TO_YARD);
        Assert.assertEquals(1.0, result, 0.0);
    }

    @Test
    public void givenLengthInFeet_IfNotEqualsInYard_ShouldReturnConversion() {
        double result = object.conversion(1, Conversion.FEET_TO_YARD);
        Assert.assertNotEquals(1, result, 0.0);
    }

    @Test
    public void givenLengthInInch_IfNotEqualsInYard_ShouldReturnConversion() {
        double result = object.conversion(1, Conversion.INCH_TO_YARD);
        Assert.assertNotEquals(1, result, 0.0);
    }

    @Test
    public void givenLengthInYard_IfEqualsInInch_ShouldReturnConversion() {
        double result = object.conversion(1, Conversion.YARD_TO_INCH);
        Assert.assertEquals(36, result, 0.0);
    }

    @Test
    public void givenLengthInInch_IfEqualsInYard_ShouldReturnConversion() {
        double result = object.conversion(36, Conversion.INCH_TO_YARD);
        Assert.assertEquals(1, result, 0.0);
    }

    @Test
    public void givenLengthInYards_IfEqualsInFeet_ShouldReturnConversion() {
        double result = object.conversion(1, Conversion.YARD_TO_FEET);
        Assert.assertEquals(3, result, 0.0);
    }
}
