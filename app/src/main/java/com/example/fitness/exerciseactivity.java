package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class exerciseactivity extends AppCompatActivity {
    public void tl_exercise1(View view){
        Intent intent = new Intent(this, lessonActivity.class);
        this.startActivity(intent);
    }

    public void tt_back0(View view){
        Intent intent = new Intent(this,homepageActivity.class);
        this.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exerciselayout);
    }
}