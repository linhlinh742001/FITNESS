package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homepageActivity extends AppCompatActivity {
    public void taptoanthan(View view){
        Intent intent = new Intent(this,exerciseactivity.class);
        this.startActivity(intent);
    }
    public void quaylaitrangtongquat(View view){
        Intent intent = new Intent(this,tongquatActivity.class);
        this.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);
    }
}