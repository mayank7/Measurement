package com.thoughtworks.bootcamp.main;

import com.thoughtworks.bootcamp.units.length.Length;
import com.thoughtworks.bootcamp.units.length.LengthFactory;
import com.thoughtworks.bootcamp.units.volume.Volume;
import com.thoughtworks.bootcamp.units.volume.VolumeFactory;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class UnitConversionTest
    extends TestCase
{
   String firstUnitStr = "m";
   String firstVolumeStr = "l";
   double firstUnitQuantity = 3;
   String secondUnitStr = "cm";
    String secondVolumeStr = "ml";
   double secondUnitQuatity = 300;


    public static Test suite()
    {
        return new TestSuite( UnitConversionTest.class );
    }


    public void testIfBothQuantitiesAreEqual() throws Exception
    {
        Length firstUnit = LengthFactory.getInstance(firstUnitStr,firstUnitQuantity);
        System.out.println("first unit length "+ firstUnit);
        Length secondUnit = LengthFactory.getInstance(secondUnitStr,secondUnitQuatity);
        System.out.println("second unit length "+ secondUnit);
        assertEquals( firstUnit.getQuantityToLowestBaseUnit(),secondUnit.getQuantityToLowestBaseUnit());
    }

    public void testConversionAndAddition() throws Exception
    {
        Length firstUnit = LengthFactory.getInstance(firstUnitStr,firstUnitQuantity);
        Length secondUnit = LengthFactory.getInstance(secondUnitStr,secondUnitQuatity);
        Length expectedUnit = LengthFactory.getInstance(firstUnitStr,6);

        Length outputunit = firstUnit.addUnits(secondUnit);
        System.out.println(outputunit);

        assertTrue(expectedUnit.equals(outputunit));

    }

    public void testVolumnConversionAndAddition() throws Exception
    {
        Volume firstUnit = VolumeFactory.getInstance(firstVolumeStr,firstUnitQuantity);
        Volume secondUnit = VolumeFactory.getInstance(secondVolumeStr,secondUnitQuatity);
        Volume expectedUnit = VolumeFactory.getInstance(firstVolumeStr,6);

        Volume outputunit = firstUnit.addUnits(secondUnit);
        System.out.println(outputunit);

        assertTrue(expectedUnit.equals(outputunit));

    }
}
