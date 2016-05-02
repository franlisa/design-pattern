package com.example;

/**
 * Created by xuejiao on 16/4/24.
 */
public class CurrentBoard implements IObserver{
    private  WeatherDisplay weatherDisplay;//这个当前板可能用来显示天气相关的(温度，适度)；以后人家可能想再观察显示日期，季节变化，所以抽出来
    private  ISubject weatherSubject;
    public  CurrentBoard(){//不在构造函数中指定监听哪些数据，实例化后想要监听那个就创建个对应的方法。

    }
    public  void observerWeather(ISubject subject){
        if(subject == null)
            throw new NullPointerException();
        this.weatherSubject = subject;
        this.weatherSubject.registerObserver(this);
    }

    @Override
    public void update(ISubject subject) {
        if(subject instanceof  WeatherDataSubject){
            WeatherDataSubject dataSubject = (WeatherDataSubject) subject;
            if(weatherDisplay == null){
                weatherDisplay = new WeatherDisplay(dataSubject.getTemperature(),dataSubject.getPressure());
            } else {
                weatherDisplay.setPressure(dataSubject.getPressure());
                weatherDisplay.setTemperature(dataSubject.getTemperature());
            }
            weatherDisplay.display();

        }

    }
}
