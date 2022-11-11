package com.example.fitness;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

//import com.bumptech.glide.Glide;

//moi

//
public class jumpstart_Activity extends AppCompatActivity {
    ImageView imageView ;
    //Chorm

//    Chronometer simpleChronometer;
//    Button start, stop, restart;
//    setFormat, clearFormat;
//moi
public void videoClick(View view ){
    Intent intent = new Intent(this,jumpingvideo_Activity.class);
    this.startActivity(intent);

}
public void startClick(View view){
    Intent intent = new Intent(this,jumping_activity.class);

    this.startActivity(intent);
}
    public void bn_backlsp1(View view){
        Intent intent = new Intent(this,lesson_part1Activity.class);
        this.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jumping_layout);


    }
}