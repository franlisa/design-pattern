package com.example;

/**
 * Created by xuejiao on 16/4/24.
 */
public class Test {


    public static void main(String[] args) {

        float temperature = 10f;
        float pressure = 20f;

        WeatherDataSubject data = new WeatherDataSubject(temperature, pressure);
        CurrentBoard currentBoard = new CurrentBoard();
        currentBoard.observerWeather(data);
        for (int i = 0;i<5;i++){
            data.dataChange(temperature++,pressure++);
        }



    }
}