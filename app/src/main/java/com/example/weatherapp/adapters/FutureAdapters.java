package com.example.weatherapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.weatherapp.R;
import com.example.weatherapp.domain.FutureDomain;
import com.example.weatherapp.domain.hourly;

import java.util.ArrayList;

public class FutureAdapters extends RecyclerView.Adapter<FutureAdapters.viewHolder> {
    ArrayList<FutureDomain> items;
    Context context;
    public FutureAdapters(ArrayList<FutureDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public FutureAdapters.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_future,parent,false);
        context = parent.getContext();
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull FutureAdapters.viewHolder holder, int position) {

    holder.daytxt.setText(items.get(position).getDay());
    holder.statustxt.setText(items.get(position).getStatus());
    holder.lowTxt.setText(items.get(position).getLowtemp()+"°");
        holder.hightxt.setText(items.get(position).getHightemp()+"°");

        int drawableResourceId = holder.itemView.getResources ()
                .getIdentifier(items.get(position).getPicapth(),  "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(context)
                .load(drawableResourceId)
                .into(holder.Pic);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
         TextView daytxt,statustxt,lowTxt,hightxt;
        ImageView Pic;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            daytxt= itemView.findViewById(R.id.daytxt);
            statustxt= itemView.findViewById(R.id.statustxt);
            lowTxt= itemView.findViewById(R.id.lowTxt);
            hightxt= itemView.findViewById(R.id.hightxt);
            Pic=itemView.findViewById(R.id.pic);
        }
    }
}
