package com.company;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws ExcFreq, ExcMan, ExcPrice, ExcCnt {
        Shop shop = new Shop();
        shop.addStock();
        System.out.println(shop.mostProductsByManufacturer());
        shop.FindBigFR();
    }

}
