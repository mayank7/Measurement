package com.thoughtworks.bootcamp.generics;

import com.thoughtworks.bootcamp.units.length.Length;
import com.thoughtworks.bootcamp.units.volume.Volume;

/**
 * Created by Praveen on 4/12/16.
 */
public interface Iunit {

    default double getQuantityToLowestBaseUnit()
    {
        return this.getValue()*this.getConversionFactor();
    }

    default Iunit addUnits(Iunit secondUnit){
        double sum=this.getQuantityToLowestBaseUnit()+ secondUnit.getQuantityToLowestBaseUnit();
        return  getFromLowestBaseUnit(sum/this.getConversionFactor());
    }

    public double getConversionFactor() ;
    public double getValue();
    public Iunit getFromLowestBaseUnit(double baseUnitValue) ;

}
