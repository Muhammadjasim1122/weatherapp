package com.example.weatherapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.weatherapp.R;
import com.example.weatherapp.adapters.FutureAdapters;
import com.example.weatherapp.domain.FutureDomain;

import java.util.ArrayList;

public class page2 extends AppCompatActivity {
  private RecyclerView.Adapter adapterTommorow;
  public RecyclerView recyclerView  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);



       initRecyclerView();
       setVariable();
       
       
    }

    private void setVariable() {
        ConstraintLayout backbtn=findViewById(R.id.backBtn);
        backbtn.setOnClickListener(v -> startActivity(new Intent(page2.this,page1.class)));

    }

    private void initRecyclerView() {


        ArrayList<FutureDomain>items=new ArrayList<>();


        items.add(new FutureDomain("Sat","storm","storm","25","10"));
        items.add(new FutureDomain("Sun","cloudy","cloudy","24","16"));
        items.add(new FutureDomain("Mon","windy","windy","30","15"));
        items.add(new FutureDomain("Tue","cloudy_sunny","cloudy_sunny","28","17"));
        items.add(new FutureDomain("Wed","sunny","sun","29","20"));
        items.add(new FutureDomain("Thurs","rainy","rainy","35","28"));



        recyclerView=findViewById(R.id.view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));


        adapterTommorow=new FutureAdapters(items);
        recyclerView.setAdapter(adapterTommorow);
    }

}