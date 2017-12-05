package com.example.ady.weatherupdate;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.ady.weatherupdate.util.LocationbyZip.Weather.HourlyForecast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ady on 11/14/2017.
 */

public class Recycleadapter extends RecyclerView.Adapter<Recycleadapter.ViewHolder> {
    List<HourlyForecast> list = new ArrayList<>();
    Context context;
    int click = 0;
    String TAG = "RecycleAdapter";

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }

    public Recycleadapter(List<HourlyForecast> list, Context contex) {

        this.list = list;
        this.context = contex;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.recycleviewlayout, null);

        return new ViewHolder(view);//this is not used
        //TODO delete this file when done!! not used
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int pposition) {

        if (list.get(pposition) != null) ;




      // for ( int k = 0; k< 16;k++) {

          // Log.d(TAG, "onBindViewHolder: inside for loop "+ list.get(position).getTemp());
        switch (pposition){
            case 0:
                holder.nowCast.setText(list.get(0).getTemp().getEnglish());
                holder.sky.setText(list.get(0).getSky());
                Log.d(TAG, "onBindViewHolder: SKYYYYY"+ list.get(0).getSky());
                int dummy = Integer.parseInt(list.get(0).getTemp().getEnglish().toString());
                //int dummy = 50;
                if (dummy < 60){
                    holder.setbackcolor.setBackgroundColor(0x889189d4);
                }else{
                    holder.setbackcolor.setBackgroundColor(0x88551c38);
                }
                holder.sky.setText(list.get(0).getSky());
                int position = 0;
            holder.weekday1.setText(list.get(position).getFCTTIME().getWeekdayName());
            holder.time1.setText(list.get(position).getFCTTIME().getHour().toString());
            holder.temphour1.setText(list.get(position).getTemp().getEnglish().toString());
            Glide.with(context)
                    .load(list.get(0).getIconUrl())
                    .into(holder.imagehour1);

            position++;
            holder.time2.setText(list.get(position).getFCTTIME().getHour().toString());
            holder.temphour2.setText(list.get(position).getTemp().getEnglish().toString());
            Glide.with(context)
                    .load(list.get(position).getIconUrl())
                    .into(holder.imagehour2);

            position++;

            holder.time3.setText(list.get(position).getFCTTIME().getHour().toString());
            holder.temphour3.setText(list.get(position).getTemp().getEnglish().toString());
            Glide.with(context)
                    .load(list.get(position).getIconUrl())
                    .into(holder.imagehour3);

            position++;

            holder.time4.setText(list.get(position).getFCTTIME().getHour().toString());
            holder.temphour4.setText(list.get(position).getTemp().getEnglish().toString());
            Glide.with(context)
                    .load(list.get(position).getIconUrl())
                    .into(holder.imagehour4);

            position++;

            holder.time5.setText(list.get(position).getFCTTIME().getHour().toString());
            holder.temphour5.setText(list.get(position).getTemp().getEnglish().toString());
            Glide.with(context)
                    .load(list.get(position).getIconUrl())
                    .into(holder.imagehour5);

            position++;

            holder.time6.setText(list.get(position).getFCTTIME().getHour().toString());
            holder.temphour6.setText(list.get(position).getTemp().getEnglish().toString());
            Glide.with(context)
                    .load(list.get(position).getIconUrl())
                    .into(holder.imagehour6);

            position++;

            holder.time7.setText(list.get(position).getFCTTIME().getHour().toString());
            holder.temphour7.setText(list.get(position).getTemp().getEnglish().toString());
            Glide.with(context)
                    .load(list.get(position).getIconUrl())
                    .into(holder.imagehour7);

            position++;

            holder.time8.setText(list.get(position).getFCTTIME().getHour().toString());
            holder.temphour8.setText(list.get(position).getTemp().getEnglish().toString());
            Glide.with(context)
                    .load(list.get(position).getIconUrl())
                    .into(holder.imagehour8);

            position++;

            holder.weekday2.setText(list.get(position).getFCTTIME().getWeekdayName());
            holder.time9.setText(list.get(position).getFCTTIME().getHour().toString());
            holder.temphour9.setText(list.get(position).getTemp().getEnglish().toString());
            Glide.with(context)
                    .load(list.get(position).getIconUrl())
                    .into(holder.imagehour9);

            position++;

            holder.time10.setText(list.get(position).getFCTTIME().getHour().toString());
            holder.temphour10.setText(list.get(position).getTemp().getEnglish().toString());
            Glide.with(context)
                    .load(list.get(position).getIconUrl())
                    .into(holder.imagehour10);

            position++;

            holder.time11.setText(list.get(position).getFCTTIME().getHour().toString());
            holder.temphour11.setText(list.get(position).getTemp().getEnglish().toString());
            Glide.with(context)
                    .load(list.get(position).getIconUrl())
                    .into(holder.imagehour11);

            position++;

            holder.time12.setText(list.get(position).getFCTTIME().getHour().toString());
            holder.temphour12.setText(list.get(position).getTemp().getEnglish().toString());
            Glide.with(context)
                    .load(list.get(position).getIconUrl())
                    .into(holder.imagehour12);

            position++;

            holder.time13.setText(list.get(position).getFCTTIME().getHour().toString());
            holder.temphour13.setText(list.get(position).getTemp().getEnglish().toString());
            Glide.with(context)
                    .load(list.get(position).getIconUrl())
                    .into(holder.imagehour13);

            position++;

            holder.time14.setText(list.get(position).getFCTTIME().getHour().toString());
            holder.temphour14.setText(list.get(position).getTemp().getEnglish().toString());
            Glide.with(context)
                    .load(list.get(position).getIconUrl())
                    .into(holder.imagehour14);

            position++;

            holder.time15.setText(list.get(position).getFCTTIME().getHour().toString());
            holder.temphour15.setText(list.get(position).getTemp().getEnglish().toString());
            Glide.with(context)
                    .load(list.get(position).getIconUrl())
                    .into(holder.imagehour15);

            position++;

            holder.time16.setText(list.get(position).getFCTTIME().getHour().toString());
            holder.temphour16.setText(list.get(position).getTemp().getEnglish().toString());
            Glide.with(context)
                    .load(list.get(position).getIconUrl())
                    .into(holder.imagehour16);
            position++;
            break;
            case 1:
                Log.d(TAG, "onBindViewHolder: Got you hahahaha");
        }





    }


    @Override
    public int getItemCount() {

        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView temphour1,temphour2,temphour3,temphour4,temphour5,temphour6,temphour7,temphour8,
                temphour9,temphour10,temphour11,temphour12,temphour13,temphour14,temphour15,temphour16,weekday1,weekday2,
                time1,time2,time3,time4,time5,time6,time7,time8,time9,time10,time11,time12,time13,time14,time15,time16,citystates,
                nowCast, sky;
        ImageView imagehour1,imagehour2,imagehour3,imagehour4,imagehour5,imagehour6,imagehour7,imagehour8,
                imagehour9,imagehour10,imagehour11,imagehour12,imagehour13,imagehour14,imagehour15,imagehour16;
        LinearLayout setbackcolor;

        public ViewHolder(View itemView) {
            super(itemView);
            temphour1 = itemView.findViewById(R.id.temphour1);
            imagehour1 = itemView.findViewById(R.id.imagehour1);
            temphour2 = itemView.findViewById(R.id.temphour2);
            imagehour2 = itemView.findViewById(R.id.imagehour2);
            temphour3 = itemView.findViewById(R.id.temphour3);
            imagehour3 = itemView.findViewById(R.id.imagehour3);
            temphour4 = itemView.findViewById(R.id.temphour4);
            imagehour4 = itemView.findViewById(R.id.imagehour4);
            temphour5 = itemView.findViewById(R.id.temphour5);
            imagehour5 = itemView.findViewById(R.id.imagehour5);
            temphour6 = itemView.findViewById(R.id.temphour6);
            imagehour6 = itemView.findViewById(R.id.imagehour6);
            temphour7 = itemView.findViewById(R.id.temphour7);
            imagehour7 = itemView.findViewById(R.id.imagehour7);
            temphour8 = itemView.findViewById(R.id.temphour8);
            imagehour8 = itemView.findViewById(R.id.imagehour8);

            temphour9 = itemView.findViewById(R.id.temphour9);
            imagehour9 = itemView.findViewById(R.id.imagehour9);
            temphour10 = itemView.findViewById(R.id.temphour10);
            imagehour10 = itemView.findViewById(R.id.imagehour10);
            temphour11 = itemView.findViewById(R.id.temphour11);
            imagehour11 = itemView.findViewById(R.id.imagehour11);
            temphour12 = itemView.findViewById(R.id.temphour12);
            imagehour12 = itemView.findViewById(R.id.imagehour12);
            temphour13 = itemView.findViewById(R.id.temphour13);
            imagehour13 = itemView.findViewById(R.id.imagehour13);
            temphour14 = itemView.findViewById(R.id.temphour14);
            imagehour14 = itemView.findViewById(R.id.imagehour14);
            temphour15 = itemView.findViewById(R.id.temphour15);
            imagehour15 = itemView.findViewById(R.id.imagehour15);
            temphour16 = itemView.findViewById(R.id.temphour16);
            imagehour16 = itemView.findViewById(R.id.imagehour16);

            time1 = itemView.findViewById(R.id.time1);
            time2 = itemView.findViewById(R.id.time2);
            time3 = itemView.findViewById(R.id.time3);
            time4 = itemView.findViewById(R.id.time4);
            time5 = itemView.findViewById(R.id.time5);
            time6 = itemView.findViewById(R.id.time6);
            time7 = itemView.findViewById(R.id.time7);
            time8 = itemView.findViewById(R.id.time8);
            time9 = itemView.findViewById(R.id.time9);
            time10 = itemView.findViewById(R.id.time10);
            time11 =itemView.findViewById(R.id.time11);
            time12 = itemView.findViewById(R.id.time12);
            time13 = itemView.findViewById(R.id.time13);
            time14 = itemView.findViewById(R.id.time14);
            time15 = itemView.findViewById(R.id.time15);
            time16 = itemView.findViewById(R.id.time16);
            weekday1 = itemView.findViewById(R.id.weekday1);
            weekday2 = itemView.findViewById(R.id.weekday2);
            citystates = itemView.findViewById(R.id.cityStates);
            nowCast = itemView.findViewById(R.id.NOwCast);
            setbackcolor =itemView.findViewById(R.id.setbackcolor);
            sky = itemView.findViewById(R.id.sky);

        }
    }
}


