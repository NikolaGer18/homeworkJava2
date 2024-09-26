package com.company;
import java.lang.*;
public class ExternalComponent extends Stock {
    protected double inch;

    public ExternalComponent(String manufacturer, int count, double price, double inch) throws ExcMan, ExcPrice, ExcCnt , ExcInch {
        super(manufacturer, count, price);
        if (inch < 0) {
            throw new ExcInch("The inches are at a negative value" + inch);
        } else {
            this.inch = inch;
        }
    }

    @Override
    public String toString() {
        return "ExternalComponent{" +
                "Inches=" + inch +
                '}';
    }
}
