package com.thoughtworks.bootcamp.units.volume;

import com.thoughtworks.bootcamp.generics.Iunit;

/**
 * Created by Praveen on 4/12/16.
 */
public abstract class Volume implements Iunit{

    protected double value;

    @Override
    public double getValue() {
        return value;
    }

    protected Volume(double value){
        this.value=value;
    }


    public double getQuantityToLowestBaseUnit() {
        return getConversionFactor() * value;
    }

    public Volume addUnits(Volume secondUnit){
        return (Volume)Iunit.super.addUnits(secondUnit);
    }

    public abstract double getConversionFactor();
    public abstract Volume getFromLowestBaseUnit(double mm);

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Volume){
            if(this.getQuantityToLowestBaseUnit() == ((Volume) obj).getQuantityToLowestBaseUnit())
                return true;

        }
        return false;
    }
}
