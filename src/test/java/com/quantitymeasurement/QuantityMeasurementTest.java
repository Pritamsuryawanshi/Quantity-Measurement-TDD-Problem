package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

public class QuantityMeasurementTest {

    public QuantityMeasurement object;

    @Before
    public void QuantityMeasurement() {
        object = new QuantityMeasurement();
    }

    @Test
    public void givenTwoValuesInFeet_IfEqual_ShouldReturnTrue() {
        double result = object.conversion(0, Conversion.FEET);
        Assert.assertEquals(0, result, 0.0);
    }

    @Test
    public void givenObject_IfNotNull_ShouldReturnFalse() {
        boolean result = object.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenObject_IfMatchesTheReference_ShouldReturnTrue() {
        QuantityMeasurement objectOne=new QuantityMeasurement();
        boolean result = object.equals(objectOne);
        Assert.assertTrue(result);
    }
    @Test
    public void givenObject_IfMatchesTheReference2_ShouldReturnTrue() {
        boolean result = object.equals(new QuantityMeasurement());
        Assert.assertTrue(result);
    }

    @Test
    public void givenObject_IfMatchesTheType_ShouldReturnTrue() {
        boolean result = Objects.equals(object.getClass(), QuantityMeasurement.class);
        Assert.assertTrue(result);
    }


    @Test
    public void givenTwoValuesInInch_IfEqual_ShouldReturnTrue() {
        double result = object.conversion(0, Conversion.INCH);
        Assert.assertEquals(0, result, 0.0);
    }

    @Test
    public void givenObjectForInch_IfNotNull_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean result = quantityMeasurement.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void givenObjectForInch_IfMatchesTheReference_ShouldReturnFTrue() {
        boolean result = object.equals(new QuantityMeasurement());
        Assert.assertTrue(result);
    }

    @Test
    public void givenObjectForInch_IfMatchesTheType_ShouldReturnTrue() {
        boolean result = object.getClass().equals(QuantityMeasurement.class);
        Assert.assertTrue(result);
    }

    @Test
    public void givenObjects_IfMatchesTheirValues_ShouldReturnTrue() {
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

    @Test
    public void givenLengthsInInch_ShouldReturnInCentimeter() {
        double result = object.conversion(2, Conversion.INCH_TO_CM);
        Assert.assertEquals(5, result, 0.0);
    }

    @Test
    public void givenLengthsInInch_ShouldReturnAddition() {
        double result = object.addition(2, 2);
        Assert.assertEquals(4, result, 0.0);
    }

    @Test
    public void givenLengthsInFeetAndInch_ShouldReturnAddition() {
        double conversion = object.conversion(1, Conversion.FEET_TO_INCH);
        double result = object.addition(conversion, 2);
        Assert.assertEquals(14, result, 0.0);
    }

    @Test
    public void givenLengthsInFeet_WhenPerformedAddition_ShouldReturnResultInInch() {
        double conversion = object.conversion(1, Conversion.FEET_TO_INCH);
        double result = object.addition(conversion, conversion);
        Assert.assertEquals(24, result, 0.0);
    }

    @Test
    public void givenLengthsInInchAndCm_WhenPerformedAddition_ShouldReturnResultInInch() {
        double conversion = object.conversion(2.5, Conversion.CM_TO_INCH);
        double result = object.addition(2, conversion);
        Assert.assertEquals(3, result, 0.0);
    }

    @Test
    public void givenVolumeInLitre_ShouldReturnConversionInGallon() {
        double conversion = object.conversion(1, Conversion.GALLON_TO_LITRE);
        Assert.assertEquals(3.79, conversion, 0.0);
    }

    @Test
    public void givenVolumeInLitre_ShouldReturnConversionInMilliliter() {
        double conversion = object.conversion(1, Conversion.LITRE_TO_ML);
        Assert.assertEquals(1000, conversion, 0.0);
    }

    @Test
    public void givenLengthsInGallonAndLitre_WhenPerformedAddition_ShouldReturnResulIntLitres() {
        double conversion = object.conversion(1, Conversion.GALLON_TO_LITRE);
        double result = object.addition(3.78, conversion);
        Assert.assertEquals(7.57, result, 0.0);
    }

    @Test
    public void givenLengthsInLitreAndMillilitre_WhenPerformedAddition_ShouldReturnResultInLitres() {
        double conversion = object.conversion(1000, Conversion.ML_TO_LITRE);
        double result = object.addition(1, conversion);
        Assert.assertEquals(2, result, 0.0);
    }

    @Test
    public void givenWeightsInKilogram_ShouldReturnConversionInGrams() {
        double conversion = object.conversion(1, Conversion.KILOGRAM_TO_GRAM);
        Assert.assertEquals(1000, conversion, 0.0);
    }

    @Test
    public void givenWeightsInTonnes__WhenPerformedAddition_ShouldReturnResultInKilogram() {
        double conversion = object.conversion(1, Conversion.TONNE_TO_KILOGRAM);
        Assert.assertEquals(1000, conversion, 0.0);
    }

    @Test
    public void givenWeightsInTonnes_ShouldReturnConversionInKilogram() {
        double conversionOne = object.conversion(1, Conversion.TONNE_TO_KILOGRAM);
        double conversionTwo = object.conversion(1000, Conversion.GRAM_TO_KILOGRAM);
        double result = object.addition(conversionOne, conversionTwo);
        Assert.assertEquals(1001, result, 0.0);
    }

    @Test
    public void givenWeightsInFarenheit_ShouldReturnConversionInCelsius() {
        double result = object.conversion(212, Conversion.FARENHEIT_TO_CELSIUS);
        Assert.assertEquals(100.00, (int) result, 0.0);
    }



    @Test
    public void givenWeightsInFarenheits_ShouldReturnConversionInCelsius() {
        double celsius = object.farenheitToCelsius(212);
        Assert.assertEquals(100.00, celsius, 0.0);
    }
}
