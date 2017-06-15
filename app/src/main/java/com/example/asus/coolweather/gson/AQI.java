package com.example.asus.coolweather.gson;

/**
 * Created by asus on 2017/6/15.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
