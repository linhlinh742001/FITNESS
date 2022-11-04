package com.example.fitness;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class lessonActivity extends AppCompatActivity {
    public void tl_open1(View view){
        Intent intent = new Intent(this, lesson_part1Activity.class);
        this.startActivity(intent);
    }
    public void tl_open2(View view){
        Intent intent = new Intent(this, lesson_part2Activity.class);
        this.startActivity(intent);
    }
    public void tl_back1Click(View view){
        Intent intent = new Intent(this, exerciseactivity.class);
        this.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson1);

    }
}