package com.example.weatherapp.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.weatherapp.Adapters.HourlyAdapters;
import com.example.weatherapp.Domains.Hourly;
import com.example.weatherapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterHourly;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerview();
    }

    private void initRecyclerview() {
        ArrayList<Hourly> items=new ArrayList<>();

        items.add(new Hourly("12.00 WIB",33,"cloudy"));
        items.add(new Hourly("14.00 WIB",34,"sunny"));
        items.add(new Hourly("15.00 WIB",33,"wind"));
        items.add(new Hourly("16.00 WIB",35,"rainy"));
        items.add(new Hourly("17.00 WIB",31,"storm"));

        recyclerView=findViewById(R.id.view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));

        adapterHourly=new HourlyAdapters(items);
        recyclerView.setAdapter(adapterHourly);
    }
}