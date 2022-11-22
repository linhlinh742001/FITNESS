package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tapcobungdetail_Activity extends AppCompatActivity {
    public void tcb_videoClickdetail(View view){
        Intent intent = new Intent(this, tapcobungdetail_video_Activity.class);
        this.startActivity(intent);
    }
    public void bn_backlsp1tapcobung(View view){
        Intent intent = new Intent(this, lesson_part1Activity.class);
        this.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tapcobungdetail_layout);
    }
}