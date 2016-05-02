package com.example;

public abstract class duck {
    public abstract  void display();
    public  void swim(){
        //都有的
        System.out.print("all duck can swim");
    }
    public void performCry(){
        if(cryBehavior != null){
            cryBehavior.cry();
        }
    }
    public  void performFly(){
        if(flyBehavior != null){
            flyBehavior.fly();
        }
    }
    private   ICryBehavior cryBehavior;
    private   IFlyBehavior flyBehavior;

    public void setCryBehavior(ICryBehavior cryBehavior) {
        this.cryBehavior = cryBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
