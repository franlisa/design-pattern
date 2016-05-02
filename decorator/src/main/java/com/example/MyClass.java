package com.example;

import java.util.Observable;
import java.util.Observer;

public class MyClass {
    public  static  void main(String[] args){
        Beverage beverage = new Beverage("dark",10);
        beverage.setCondiment(new Beverage("milk",5));
        System.out.print(beverage.getCost()+","+beverage.getDescribption());
    }
    class A extends  Observable implements Observer{

        @Override
        public void update(Observable o, Object arg) {

        }
    }
}
