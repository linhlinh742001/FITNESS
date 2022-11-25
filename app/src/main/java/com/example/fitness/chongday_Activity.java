package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chongday_Activity extends AppCompatActivity {
    public void bn_backlsp1chongday(View view){
        Intent intent = new Intent(this, lesson_part1Activity.class);
        this.startActivity(intent);
    }
    public void bn_nexttapcobung(View view){
        Intent intent = new Intent(this, tapcobung_Activity.class);
        this.startActivity(intent);
    }
    public void startClick(View view){
        Intent intent = new Intent(this,jumping_activity.class);

        this.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chongday_layout);
    }
}