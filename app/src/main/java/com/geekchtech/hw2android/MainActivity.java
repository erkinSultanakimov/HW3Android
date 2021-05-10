package com.geekchtech.hw2android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Data> data = new ArrayList<Data>();
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        setInfo();
        setAdapter();


    }

    private void setAdapter() {
        Adapter adapter = new Adapter(data);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setInfo() {
        data.add(new Data("1", "Заголовок", "Подзаголовок", "12.01.21"));
        data.add(new Data("2", "Заголовок", "Подзаголовок", "12.01.21"));
        data.add(new Data("3", "Заголовок", "Подзаголовок", "12.01.21"));
        data.add(new Data("4", "Заголовок", "Подзаголовок", "12.01.21"));
        data.add(new Data("5", "Заголовок", "Подзаголовок", "12.01.21"));
        data.add(new Data("6", "Заголовок", "Подзаголовок", "12.01.21"));
        data.add(new Data("7", "Заголовок", "Подзаголовок", "12.01.21"));
        data.add(new Data("8", "Заголовок", "Подзаголовок", "12.01.21"));
        data.add(new Data("9", "Заголовок", "Подзаголовок", "12.01.21"));
        data.add(new Data("10", "Заголовок", "Подзаголовок", "12.01.21"));
        data.add(new Data("11", "Заголовок", "Подзаголовок", "12.01.21"));
    }


}