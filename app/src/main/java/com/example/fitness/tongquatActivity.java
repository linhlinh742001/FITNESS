package com.example.fitness;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class tongquatActivity extends AppCompatActivity {
    public void baitaptheduc(View view){
        Intent intent = new Intent(this,homepageActivity.class);
        this.startActivity(intent);
    }
    public void tinhchiso(View view){
        Intent intent = new Intent(this,bmiActivity.class);
        this.startActivity(intent);
    }
    public void thucdon(View view){
        Intent intent = new Intent(this,thucdon1Activity.class);
        this.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tongquatlayout);
    }
}