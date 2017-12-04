package com.example.ady.weatherupdate;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
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

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        if (list.get(position) != null) ;
        holder.temphour1.setText(list.get(position).getTemp().getEnglish());
        holder.temphour2.setText(list.get(position).getTemp().getEnglish());
        holder.temphour3.setText(list.get(position).getTemp().getEnglish());
        holder.temphour4.setText(list.get(position).getTemp().getEnglish());
        holder.temphour5.setText(list.get(position).getTemp().getEnglish());
        holder.temphour6.setText(list.get(position).getTemp().getEnglish());
        holder.temphour7.setText(list.get(position).getTemp().getEnglish());
        holder.temphour8.setText(list.get(position).getTemp().getEnglish());
        Glide.with(context)
                .load(list.get(position).getIconUrl())

                .into(holder.imagehour1);
        Glide.with(context)
                .load(list.get(position).getIconUrl())
                .into(holder.imagehour2);
        Glide.with(context)
                .load(list.get(position).getIconUrl())
                .into(holder.imagehour3);
        Glide.with(context)
                .load(list.get(position).getIconUrl())
                .into(holder.imagehour4);
        Glide.with(context)
                .load(list.get(position).getIconUrl())
                .into(holder.imagehour5);
        Glide.with(context)
                .load(list.get(position).getIconUrl())
                .into(holder.imagehour6);
        Glide.with(context)
                .load(list.get(position).getIconUrl())
                .into(holder.imagehour7);
        Glide.with(context)
                .load(list.get(position).getIconUrl())
                .into(holder.imagehour8);


       // holder.title.setText(list.get(position).getCity() + "," +list.get(position).getStates());
       // holder.currenttemp.setText(list.get(position).getCurrentTemp());
        //Glide.with(context)
          //      .load(list.get(position).getM())
            //    .thumbnail(0.1f)
              //  .into(holder.listimage);
       // if (Integer.getInteger(list.get(position).getCurrentTemp()) > 60){
        //    holder.firstview.setBackgroundColor(0xFF4081);
       // }else{
        //    holder.firstview.setBackgroundColor(0x3F51B5);
       // }
    }


    @Override
    public int getItemCount() {

        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView currenttemp;
        LinearLayout firstview;
        TextView temphour1;
        ImageView imagehour1;
        TextView temphour2;
        ImageView imagehour2;
        TextView temphour3;
        ImageView imagehour3;
        TextView temphour4;
        ImageView imagehour4;
        TextView temphour5;
        ImageView imagehour5;
        TextView temphour6;
        ImageView imagehour6;
        TextView temphour7;
        ImageView imagehour7;
        TextView temphour8;
        ImageView imagehour8;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.citystates);
            currenttemp=itemView.findViewById(R.id.currentTemp);
            firstview=itemView.findViewById(R.id.Firstview);
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

        }
    }
}


