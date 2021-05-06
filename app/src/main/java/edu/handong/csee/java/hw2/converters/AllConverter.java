package edu.handong.csee.java.hw2.converters;

/**
* This is AllConverter class that makes an instance of Allconverter.
*/
public class AllConverter{
    private double fValue;
    private String oMeasure;

    /**
    *This is setFromValue method that sets the value of fValue.
    */
    public AllConverter setFromValue(double fromValue){
        fValue = fromValue;
        return this;
    }
    /**
    *This is setOriginalMeasure method that sets the value of oMeasure.
    */
    public AllConverter setOriginalMeasure(String originalMeasure){
        oMeasure = originalMeasure;
        return this;
    }
    /**
    *This is convertAndPrintOut method that converts TON to KG and G show the result or convert KM to M and MILE and show the result.
    */
    public void convertAndPrintOut(){
        if(oMeasure.equals("TON")){
            System.out.println(fValue + " " + oMeasure + " to " + fValue*1000 + " KG");
            System.out.println(fValue + " " + oMeasure + " to " + fValue*1000000 + " G");
        }
        else if(oMeasure.equals("KM")){
            System.out.println(fValue + " " + oMeasure + " to " + fValue*1000 + " M");
            System.out.println(fValue + " " + oMeasure + " to " + fValue/1.6 + " MILE");
        }else{
            System.out.println("AllConverter cannot support the measure!");
        }

    }
    
    
}