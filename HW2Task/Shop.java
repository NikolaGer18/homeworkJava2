package com.company;
import java.util.*;


public class Shop  {
    TreeSet<Stock> Stock = new TreeSet<>();

    public Shop(TreeSet<Stock> stock) {
        Stock = stock;
    }

    public Shop() {

    }

    @Override
    public String toString() {
        return "Shop{" +
                "Stock=" + Stock +
                '}';
    }

    public void addStock() throws ExcMan, ExcPrice, ExcCnt {
        Stock.add(new Stock("Ryzen", 3, 67.84));
        Stock.add(new Stock("Intel", 5,39.23));
    }

    String mostProductsByManufacturer(){
        List<Stock> stockList = new ArrayList<>(Stock);
        Collections.sort(stockList, new Comparator<Stock>(){
            @Override
            public int compare(Stock a1, Stock a2){
                return a1.getCount() - a2.getCount();
            }
        });
        return "The manufacturer with the most products is: "+stockList.get(stockList.size() - 1).getManufacturer();
    }


    public void FindBigFR() throws ExcFreq, ExcMan, ExcPrice, ExcCnt {
        List<InternalComponent> frequencyList = new ArrayList<>();
        frequencyList.add(new InternalComponent("Ryzen",5,62.33,2400.00));
        frequencyList.add(new InternalComponent("Intel",8,92.33,3800.00));
        double temp = 0;
        for(InternalComponent i : frequencyList)
        {
            if(i.getFrequency() > temp)
                temp = i.getFrequency();
        }
        System.out.println("The stock with the most frequency is: " + temp);
    }

}
