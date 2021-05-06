package edu.handong.csee.java.hw2.converters;

/**
*This is Convertible interface which is a collection of methods to interact with *Converter Class.
*/
public interface Convertible {
    
    /**
    *This is setFromValue method that sets the value of field which represents fromValue in certain Class.
    */
    public void setFromValue(double fromValue);
    /**
    *This is getConvertedValue method that return value of field which represents converted value in certain Calss.
    */
    public double getConvertedValue();
    /**
    *This is convert method that converts the value expressed in A Measure to B Measure. A and B can be determined by user.
    */
    public void convert();

}