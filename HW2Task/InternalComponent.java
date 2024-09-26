package com.company;
import java.lang.*;
public class InternalComponent extends Stock {
    protected double frequency;

    public InternalComponent(String manufacturer, int count, double price,double frequency) throws ExcFreq, ExcMan, ExcPrice, ExcCnt {
        super(manufacturer, count, price);
        if(frequency<0){
        throw new ExcFreq("The frequency is at a negative value" + frequency);
        }
        else {
            this.frequency = frequency;
        }
    }

    public double getFrequency() {
        return frequency;
    }



    @Override
    public String toString() {
        return "InternalComponent{" +
                "frequency=" + frequency +
                '}';
    }
}
