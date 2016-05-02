package com.example;

/**
 * Created by xuejiao on 16/4/24.
 */
public interface IObserver  {
    //加上主题参数，因为可能一个观察者监听多个主题
    void update(ISubject subject);
}
