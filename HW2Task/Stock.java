package com.company;
import java.lang.*;

public class Stock implements Comparable<Object>{
    protected String manufacturer;
    protected int count;
    protected double price;

    public Stock(String manufacturer, int count, double price) throws ExcMan,ExcCnt,ExcPrice  {
        if(count<0){
            throw new ExcCnt("This product is out of stock");
        }
        else
            this.count = count;

        if(manufacturer == ""){
            throw new ExcMan("This manufacturer does not have a name");
        }
        else
            this.manufacturer = manufacturer;
        if(price<0){
            throw new ExcPrice("The price can not be at a negative value: " + price);
        }
        else
            this.price = price;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "manufacturer='" + manufacturer + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }



    @Override
    public boolean equals(Object o) {
        return this.manufacturer.equals(((Stock) o).manufacturer);
    }

    @Override
    public int compareTo(Object o) {
        return this.manufacturer.compareTo(((Stock) o).manufacturer);
    }
}
