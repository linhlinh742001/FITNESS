package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class buoclenghedetail_Activity extends AppCompatActivity {
    public void bn_backlsp1lenghe(View view){
        Intent intent = new Intent(this, lesson_part1Activity.class);
        this.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buoclenghedetail_layout);
    }
}