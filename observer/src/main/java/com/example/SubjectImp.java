package com.example;

import java.util.Vector;

/**
 * Created by xuejiao on 16/4/24.
 */
public class SubjectImp implements ISubject {
    private  boolean isChange = false;
    protected Vector<IObserver>  observers;
    public  SubjectImp(){
        this.observers = new Vector<>();
    }
    @Override
    public void registerObserver(IObserver o) {
        if(o == null){
            throw new NullPointerException();
        }
        if(!observers.contains(o)){
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);

    }

    @Override
    public void notifyObservers() {
        if(!isChange){
            return;
        }
        for (int i = 0 ;i < observers.size();i++){
            observers.get(i).update(this);
        }
        setChange(false);
    }

    public void setChange(boolean change) {
        isChange = change;
    }

    public boolean isChange() {
        return isChange;
    }
    public  boolean getChange(){
        return isChange;
    }
}
