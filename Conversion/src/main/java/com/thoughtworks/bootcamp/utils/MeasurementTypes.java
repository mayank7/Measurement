//package com.thoughtworks.bootcamp.utils;
//
//import MiliLitre;
//import Length;
//import Litre;
//
///**
// * Created by Praveen on 4/12/16.
// */
//public enum MeasurementTypes {
//
//    private double value;
//    private String unitText;
//
//    Litre("m"){
//        public Length getInstance()
//        {
//            return new Litre(this.value);
//        }
//    },
//    MiliLitre("cm"){
//        public Length getInstance() {
//            return new MiliLitre(this.value);
//        }
//    };
//
//    public MeasurementTypes(String unitText){
//        this.unitText=unitText;
//
//    }
//    public MeasurementTypes(double value){
//        this.value=value;
//
//    }
//
//    public abstract Length getInstance();
//}
