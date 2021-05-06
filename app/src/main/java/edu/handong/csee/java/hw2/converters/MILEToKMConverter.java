package edu.handong.csee.java.hw2.converters;

/** 
* This is MILEToKMConverter class that makes an instance of MILEToKMConverter. And it implements Convertible interface.
*/
public class MILEToKMConverter implements Convertible{

    private double fValue;
    private double cValue;

    /** 
    *This is setFromValue method that sets the value of fValue.
    */
    public void setFromValue(double fromValue){
        fValue = fromValue;
    }
    /**
    *This is getConvertedValue method that return value of cValue.
    */
    public double getConvertedValue(){
        return cValue;
    }
    /**
    *This is convert method that converts the value expressed in MILE to KM.
    */
    public void convert(){
        cValue = fValue * 1.6;
    }
}