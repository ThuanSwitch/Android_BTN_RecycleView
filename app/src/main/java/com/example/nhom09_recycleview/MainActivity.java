package com.example.nhom09_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvMonhoc = (RecyclerView) findViewById(R.id.rcvMonhoc);
        MonHocAdapter monHocAdapter = new MonHocAdapter(MonHoc.LayDsMonHoc());
        rvMonhoc.setAdapter(monHocAdapter);
        rvMonhoc.setLayoutManager(new LinearLayoutManager(this));
    }
}