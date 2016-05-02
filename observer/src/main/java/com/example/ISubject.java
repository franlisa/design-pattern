package com.example;

/**
 * Created by xuejiao on 16/4/24.
 */
public interface ISubject  {
     void registerObserver(IObserver o);
     void removeObserver(IObserver o);
     void notifyObservers();

}
