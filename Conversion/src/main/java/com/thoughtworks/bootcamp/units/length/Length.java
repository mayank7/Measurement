package com.thoughtworks.bootcamp.units.length;

import com.thoughtworks.bootcamp.generics.Iunit;

/**
 * Created by Praveen on 4/11/16.
 */
public abstract class Length implements Iunit {


   protected double value;


   public double getValue() {
      return value;
   }

   protected Length(double value){
      this.value=value;
   }

   public Length addUnits(Length secondUnit){
      return (Length)Iunit.super.addUnits(secondUnit);
   }

   public abstract double getConversionFactor();
   public abstract Length getFromLowestBaseUnit(double mm);

   @Override
   public boolean equals(Object obj){
      if(obj instanceof Length){
         if(this.getQuantityToLowestBaseUnit() == ((Length) obj).getQuantityToLowestBaseUnit())
            return true;

      }
      return false;
   }

}
