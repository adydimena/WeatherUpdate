
package com.example.ady.weatherupdate.util.LocationbyZip.Weather;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Features implements Serializable
{

    @SerializedName("forecast10day")
    @Expose
    private Integer forecast10day;
    private final static long serialVersionUID = -8820602490356715277L;

    public Integer getForecast10day() {
        return forecast10day;
    }

    public void setForecast10day(Integer forecast10day) {
        this.forecast10day = forecast10day;
    }

}
