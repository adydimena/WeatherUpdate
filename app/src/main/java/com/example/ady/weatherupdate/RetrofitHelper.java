package com.example.ady.weatherupdate;


import com.example.ady.weatherupdate.util.LocationbyZip.Weather.ForeCastbyHour;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Ady on 11/29/2017.
 */

public class RetrofitHelper {

    public static final String BASE_URL = "http://api.wunderground.com/";


    //    build the retrofit object to be used
    public static Retrofit create() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;

    }
    public static Call<ForeCastbyHour> responseback(){
        Retrofit retrofit = create();
        RetrofitService service = retrofit.create(RetrofitService.class);
        return service.responseback();
    }


    //    create an interface for http verbs
    interface RetrofitService  {



       @GET("api/7453d2c751a72e01/hourly/lang:EN/pws:0/q/02301.json")
       Call<ForeCastbyHour> responseback();
        //Call<ForeCastbyHour> responseback(@Path("zipcode")int zipcode);
    }
}