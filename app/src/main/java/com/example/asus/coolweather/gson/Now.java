package com.example.asus.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus on 2017/6/15.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
