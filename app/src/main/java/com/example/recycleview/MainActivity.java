package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;
String[] titr;
String[] soust;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.RecyckeV);
        titr = getResources().getStringArray(R.array.titre);
        soust = getResources().getStringArray(R.array.stit);
        ListAdapter ad;
        Integer[] img ={R.drawable.he,R.drawable.he1,R.drawable.he3,R.drawable.he4,R.drawable.he5,R.drawable.he6,R.drawable.he7};

        ad = new ListAdapter(MainActivity.this,titr,soust,img);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(ad);


    }
}