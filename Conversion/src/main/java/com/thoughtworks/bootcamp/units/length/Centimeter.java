package com.thoughtworks.bootcamp.units.length;

/**
 * Created by Praveen on 4/11/16.
 */
public class Centimeter extends Length {


    private double conversionFactor=10;

    public Centimeter(Double value){
        super(value);

    }

    public double getConversionFactor() {
        return this.conversionFactor;
    }

    public Length getFromLowestBaseUnit(double mm) {
        return new Centimeter(mm);
    }

    @Override
    public String toString(){
        return this.value+" CM";
    }
}
