package com.example;

/**
 * Created by xuejiao on 16/4/24.
 * 就这个需求，感觉这样就足够了。
 */
public   class Beverage {
    private String describption;
    private int cost;

    public Beverage(String describption, int cost) {
        this.describption = describption;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getDescribption() {
        return describption;
    }

    public  void  setCondiment(Beverage condiment){
        this.cost+=condiment.getCost();
        this.describption=condiment.getDescribption()+this.describption;
    }
}
