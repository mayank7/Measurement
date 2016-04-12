package com.thoughtworks.bootcamp.units.volume;

/**
 * Created by Praveen on 4/11/16.
 */
public class MiliLitre extends Volume {


    private double conversionFactor=1;

    public MiliLitre(Double value){
        super(value);

    }

    public double getConversionFactor() {
        return this.conversionFactor;
    }

    public Volume getFromLowestBaseUnit(double mm) {
        return new MiliLitre(mm);
    }

    @Override
    public String toString(){
        return this.value+" ML";
    }
}
