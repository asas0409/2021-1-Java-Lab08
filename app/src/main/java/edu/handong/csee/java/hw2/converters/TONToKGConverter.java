package edu.handong.csee.java.hw2.converters;

/** 
* This is TONToKGConverter class that makes an instance of TONToKGConverter. And it implements Convertible interface.
*/
public class TONToKGConverter implements Convertible{

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
    *This is convert method that converts the value expressed in TON to KG.
    */
    public void convert(){
        cValue = fValue * 1000;
    }
}