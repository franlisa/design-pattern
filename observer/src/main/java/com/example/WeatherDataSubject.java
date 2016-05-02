package com.example;

/**
 * Created by xuejiao on 16/4/24.
 */
public class WeatherDataSubject extends SubjectImp {

    private float temperature;
    private float pressure;

    public WeatherDataSubject(Float temperature, Float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public  void dataChange(Float temperature, Float pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        setChange(true);
        notifyObservers();
    }
}
