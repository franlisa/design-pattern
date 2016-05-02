package com.example;

/**
 * Created by xuejiao on 16/4/17.
 */
public class TestClass {
    public  static void  main(String[] args){
        duck duck = new GreenDuck();
        duck.display();
        duck.setCryBehavior(new CryGuaGua());
        duck.setFlyBehavior(new FlyWithHead());
        duck.performCry();
        duck.performFly();
    }
}
