package com.thoughtworks.bootcamp.units.length;

/**
 * Created by Praveen on 4/11/16.
 */
public class Meter extends Length {

    private double conversionFactor=1000;

    public Meter(Double value){
        super(value);
    }

    public double getConversionFactor() {
        return this.conversionFactor;
    }


    public Length getFromLowestBaseUnit(double mm) {
        return new Meter(mm);
    }

    @Override
    public String toString(){
        return this.value+" M";
    }
}
