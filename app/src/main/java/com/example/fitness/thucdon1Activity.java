package com.example.fitness;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class thucdon1Activity extends AppCompatActivity {
    public void tl_open1(View view){
        Intent intent = new Intent(this, menu1Activity.class);
        this.startActivity(intent);
    }
    public void tl_open2(View view){
        Intent intent = new Intent(this, menu2Activity.class);
        this.startActivity(intent);
    }
    public void tl_back_tongquat(View view){
        Intent intent = new Intent(this, tongquatActivity.class);
        this.startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thucdon1_layout);
    }
}