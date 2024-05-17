package com.example.weatherapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.weatherapp.R;
import com.example.weatherapp.domain.hourly;

import java.util.ArrayList;

public class HourlyAdapters extends RecyclerView.Adapter<HourlyAdapters.viewHolder> {
    ArrayList<hourly> items;
    Context context;
    public HourlyAdapters(ArrayList<hourly> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public HourlyAdapters.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_hourly,parent,false);
        context = parent.getContext();
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull HourlyAdapters.viewHolder holder, int position) {
   holder.HourTxt.setText(items.get(position).getHour());
   holder.TempTxt.setText(items.get(position).getTemp());


        int drawableResourceId = holder.itemView.getResources ()
                .getIdentifier(items.get(position).getPicpath(),  "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(context)
                .load(drawableResourceId)
                .into(holder.Pic);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
         TextView HourTxt,TempTxt;
        ImageView Pic;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            HourTxt= itemView.findViewById(R.id.hourTxt);
            TempTxt= itemView.findViewById(R.id.TempTxt);
            Pic=itemView.findViewById(R.id.pic);
        }
    }
}
