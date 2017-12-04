package com.example.ady.weatherupdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.ady.weatherupdate.util.LocationbyZip.Weather.ForeCastbyHour;
import com.example.ady.weatherupdate.util.LocationbyZip.Weather.HourlyForecast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    int zipcode;
    private List<WeatherFields> list;
    private List<HourlyForecast> forecastsbyHour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();
        forecastsbyHour = new ArrayList<>();
        zipcode = 02301;
        Log.d(TAG, "onCreate: before calling retrofit");
        RetrofitHelper.responseback()
                .enqueue(new Callback<ForeCastbyHour>() {
                    @Override
                    public void onResponse(Call<ForeCastbyHour> call, retrofit2.Response<ForeCastbyHour> response) {
                        forecastsbyHour = (response.body().getHourlyForecast());



                        RecyclerView recyclerView = findViewById(R.id.recycleMainAcitivity);
                        RecyclerView.LayoutManager layoutManager =
                                new LinearLayoutManager(MainActivity.this);
                        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
                        Recycleadapter recycleadapter = new Recycleadapter(forecastsbyHour,MainActivity.this);
                        recyclerView.setLayoutManager(layoutManager);
                        recyclerView.setItemAnimator(itemAnimator);
                        recyclerView.setAdapter(recycleadapter);

                      //  String data =" " + response.body().getCurrentObservation().getTempF();
                       // Toast.makeText(MainActivity.this
                        //        ,""+data
                         //       ,Toast.LENGTH_LONG).show();
                      //  Log.d(TAG, "onResponse: WORKEDDD "+data);


                    }

                    @Override
                    public void onFailure(Call<ForeCastbyHour> call, Throwable t) {
                        Toast.makeText(MainActivity.this,"ERROR"+t.getMessage(),Toast.LENGTH_LONG).show();
                        Log.d(TAG, "onResponse: NOT WORKINGG"+t.getMessage());
                    }
                });
    }
}
