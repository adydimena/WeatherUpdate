package com.example.ady.weatherupdate;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.ady.weatherupdate.util.LocationbyZip.Weather.ForeCastbyHour;
import com.example.ady.weatherupdate.util.LocationbyZip.Weather.HourlyForecast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    int zipcode;

    private List<HourlyForecast> list;
    Handler myhandlerl;
    String mymessage;
    TextView title;
    TextView currenttemp;
    LinearLayout firstview;
    TextView temphour1,temphour2,temphour3,temphour4,temphour5,temphour6,temphour7,temphour8,
            temphour9,temphour10,temphour11,temphour12,temphour13,temphour14,temphour15,temphour16,weekday1,weekday2,
    time1,time2,time3,time4,time5,time6,time7,time8,time9,time10,time11,time12,time13,time14,time15,time16,citystates,
    nowCast, sky;
    ImageView imagehour1,imagehour2,imagehour3,imagehour4,imagehour5,imagehour6,imagehour7,imagehour8,
            imagehour9,imagehour10,imagehour11,imagehour12,imagehour13,imagehour14,imagehour15,imagehour16;
    LinearLayout setbackcolor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        zipcode = 02301;
        Log.d(TAG, "onCreate: before calling retrofit");
        Inicialazation();
        RetrofitHelper.responseback()
                .enqueue(new Callback<ForeCastbyHour>() {
                    @Override
                    public void onResponse(Call<ForeCastbyHour> call, retrofit2.Response<ForeCastbyHour> response) {
                        list = (response.body().getHourlyForecast());
                        Log.d(TAG, "onResponse: list " + list.get(0).getTemp().getEnglish());
                        RecyclerView recyclerView = findViewById(R.id.recycleMainLayout);
                        RecyclerView.LayoutManager layoutManager =
                                new LinearLayoutManager(MainActivity.this);
                        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
                        Recycleadapter recycleadapter = new Recycleadapter(list,MainActivity.this);
                        recyclerView.setLayoutManager(layoutManager);
                        recyclerView.setItemAnimator(itemAnimator);
                        recyclerView.setAdapter(recycleadapter);

                    }
                    @Override
                    public void onFailure(Call<ForeCastbyHour> call, Throwable t) {
                        Toast.makeText(MainActivity.this,"ERROR"+t.getMessage(),Toast.LENGTH_LONG).show();
                        Log.d(TAG, "onResponse: NOT WORKINGG"+t.getMessage());
                    }
                });

    }

    private void Inicialazation() {
        list = new ArrayList<>();
        //title = findViewById(R.id.citystates);
        //currenttemp=findViewById(R.id.currentTemp);
        //firstview=findViewById(R.id.Firstview);
        temphour1 = findViewById(R.id.temphour1);
        imagehour1 = findViewById(R.id.imagehour1);
        temphour2 = findViewById(R.id.temphour2);
        imagehour2 = findViewById(R.id.imagehour2);
        temphour3 = findViewById(R.id.temphour3);
        imagehour3 = findViewById(R.id.imagehour3);
        temphour4 = findViewById(R.id.temphour4);
        imagehour4 = findViewById(R.id.imagehour4);
        temphour5 = findViewById(R.id.temphour5);
        imagehour5 = findViewById(R.id.imagehour5);
        temphour6 = findViewById(R.id.temphour6);
        imagehour6 = findViewById(R.id.imagehour6);
        temphour7 = findViewById(R.id.temphour7);
        imagehour7 = findViewById(R.id.imagehour7);
        temphour8 = findViewById(R.id.temphour8);
        imagehour8 = findViewById(R.id.imagehour8);

        temphour9 = findViewById(R.id.temphour9);
        imagehour9 = findViewById(R.id.imagehour9);
        temphour10 = findViewById(R.id.temphour10);
        imagehour10 = findViewById(R.id.imagehour10);
        temphour11 = findViewById(R.id.temphour11);
        imagehour11 = findViewById(R.id.imagehour11);
        temphour12 = findViewById(R.id.temphour12);
        imagehour12 = findViewById(R.id.imagehour12);
        temphour13 = findViewById(R.id.temphour13);
        imagehour13 = findViewById(R.id.imagehour13);
        temphour14 = findViewById(R.id.temphour14);
        imagehour14 = findViewById(R.id.imagehour14);
        temphour15 = findViewById(R.id.temphour15);
        imagehour15 = findViewById(R.id.imagehour15);
        temphour16 = findViewById(R.id.temphour16);
        imagehour16 = findViewById(R.id.imagehour16);

        time1 = findViewById(R.id.time1);
        time2 = findViewById(R.id.time2);
        time3 = findViewById(R.id.time3);
        time4 = findViewById(R.id.time4);
        time5 = findViewById(R.id.time5);
        time6 = findViewById(R.id.time6);
        time7 = findViewById(R.id.time7);
        time8 = findViewById(R.id.time8);
        time9 = findViewById(R.id.time9);
        time10 = findViewById(R.id.time10);
        time11 = findViewById(R.id.time11);
        time12 = findViewById(R.id.time12);
        time13 = findViewById(R.id.time13);
        time14 = findViewById(R.id.time14);
        time15 = findViewById(R.id.time15);
        time16 = findViewById(R.id.time16);
        weekday1 = findViewById(R.id.weekday1);
        weekday2 = findViewById(R.id.weekday2);
        citystates = findViewById(R.id.cityStates);
        nowCast = findViewById(R.id.NOwCast);
        setbackcolor =findViewById(R.id.setbackcolor);
        sky = findViewById(R.id.sky);

        myhandlerl = new Handler(Looper.getMainLooper());
    }
}
