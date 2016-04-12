package com.thoughtworks.bootcamp.units.volume;



    public  class VolumeFactory {

        public static Volume getInstance(String unitText, double number) throws Exception
        {
            if(unitText.equals("l") || unitText.equals("litre"))
            {
                return new Litre(number);
            }
            else if(unitText.equals("ml") || unitText.equals("mililitre"))
            {
                return  new MiliLitre(number);
            }

            throw new Exception("Not Supported unit.");
        }
    }

