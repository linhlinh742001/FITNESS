package com.example.fitness;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class lesson_part1Activity extends AppCompatActivity {
    public void tl_back2Click(View view){
        Intent intent = new Intent(this,lessonActivity.class);
        this.startActivity(intent);
    }
    public void bn_jumping(View view){
        Intent intent = new Intent(this,jumpstart_Activity.class);
        this.startActivity(intent);
    }

    public void bn_jumpingdetail(View view){
        Intent intent = new Intent(this,jumpingdetail_Activity.class);
        this.startActivity(intent);
    }
    public void bn_backlsp1(View view){
        Intent intent = new Intent(this,lessonActivity.class);
        this.startActivity(intent);
    }

    public void bn_buoclenghedetails(View view){
        Intent intent = new Intent(this, buoclenghedetail_Activity.class);
        this.startActivity(intent);
    }
    public void bn_chongdaydetails(View view){
        Intent intent = new Intent(this, chongdaydetails_Activity.class);
        this.startActivity(intent);
    }
    public void bn_tapcobungdetails(View view){
        Intent intent = new Intent(this, tapcobungdetail_Activity.class);
        this.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_part1);
    }
}