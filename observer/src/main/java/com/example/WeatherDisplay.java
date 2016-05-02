package com.example;

/**
 * Created by xuejiao on 16/4/24.
 */
public class WeatherDisplay implements  IDisplay{
    private float  temperature;
    private float pressure;

    public WeatherDisplay(float temperature, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    @Override
    public void display() {
        System.out.println("the current weather data is: temprerature"+temperature+",press = "+pressure);
    }

}
