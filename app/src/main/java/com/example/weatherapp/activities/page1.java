package com.example.weatherapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.weatherapp.R;
import com.example.weatherapp.adapters.HourlyAdapters;
import com.example.weatherapp.domain.hourly;

import java.util.ArrayList;

public class page1 extends AppCompatActivity {
private RecyclerView.Adapter adapterHourly;
private RecyclerView recyclerView;
    ArrayList<hourly> items=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);


        initRecyclereview();
        setVarible();

        recyclerView = findViewById(R.id.items1);
        recyclerView.setLayoutManager (new LinearLayoutManager( this, LinearLayoutManager. HORIZONTAL, false));
        adapterHourly = new HourlyAdapters(items);
        recyclerView.setAdapter (adapterHourly);
    }

    private void setVarible() {
        TextView next7daysBtn=findViewById(R.id.nextbtn);
        next7daysBtn.setOnClickListener(v -> startActivity(new Intent(page1.this,page2.class )));
    }

    private void initRecyclereview() {
        items.add(new hourly("9 pm","28","cloudy"));

        items.add(new hourly("11 pm","29","sunny"));

        items.add(new hourly("12 pm","30","rainy"));

        items.add(new hourly("1 am","29","wind"));

        items.add(new hourly("2 am","27","storm"));





    }
}