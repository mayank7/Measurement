package com.thoughtworks.bootcamp.units.volume;

/**
 * Created by Praveen on 4/11/16.
 */
public class Litre extends Volume {

    private double conversionFactor=1000;

    public Litre(Double value){
        super(value);
    }

    public double getConversionFactor() {
        return this.conversionFactor;
    }


    public Volume getFromLowestBaseUnit(double mm) {
        return new Litre(mm);
    }

    @Override
    public String toString(){
        return this.value+" L";
    }
}
