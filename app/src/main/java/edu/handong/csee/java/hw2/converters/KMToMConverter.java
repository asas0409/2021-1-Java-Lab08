package edu.handong.csee.java.hw2.converters;

/**
* This is KMToMConverter class that makes an instance of KMToMConverter. And it implements Convertible interface.
*/
public class KMToMConverter implements Convertible{

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
    *This is convert method that converts the value expressed in KM to M.
    */
    public void convert(){
        cValue = fValue * 1000;
    }
}