package com.thoughtworks.bootcamp.units.length;

import java.lang.reflect.Constructor;
import java.util.HashMap;

/**
 * Created by Praveen on 4/11/16.
 */
public  class LengthFactory {

    private static HashMap<String, String> patternMap ;

    static
    {
        patternMap = new HashMap<String, String>();
        patternMap.put("m","com.thoughtworks.bootcamp.units.length.Meter");
        patternMap.put("meters","com.thoughtworks.bootcamp.units.length.Meter");
        patternMap.put("cm","com.thoughtworks.bootcamp.units.length.Centimeter");
        patternMap.put("centimeters","com.thoughtworks.bootcamp.units.length.Centimeter");
    }

    public static Length getInstance(String unitText, double number) throws Exception
    {

        if(!patternMap.containsKey(unitText))
        {
            throw  new Exception("Unit not supported.");
        }

        String className = patternMap.get(unitText);
        Class<?> cls=Class.forName(className);
        Constructor ctr=cls.getConstructor(Double.class);
        Object obj=ctr.newInstance(new Double(number));

        return (Length) obj;

    }


}

