package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chongdaydetails_Activity extends AppCompatActivity {
    public void bn_backlsp1pushup(View view){
        Intent intent = new Intent(this,lesson_part1Activity.class);
        this.startActivity(intent);

    }
    public void videochongday(View view){
        Intent intent = new Intent(this,chongdayvideo_Activity.class);
        this.startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chongdaydetails_layout);
    }
}