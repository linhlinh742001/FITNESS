package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class buoclenghe_Activity extends AppCompatActivity {
    public void bn_backlsp1_blg(View view){
        Intent intent = new Intent(this, lesson_part1Activity.class);
        this.startActivity(intent);
    }
    public void bn_nextchongday(View view){
        Intent intent = new Intent(this, chongday_Activity.class);
        this.startActivity(intent);
    }
    public void startClick(View view){
        Intent intent = new Intent(this,jumping_activity.class);
        this.startActivity(intent);
    }
    public void videoClickbuoclenghe(View view){
        Intent intent = new Intent(this,buoclenghdetail_video_Activity.class);
        this.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.buoclenghe_layout);
    }
}