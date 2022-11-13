package com.example.fitness;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatSeekBar;

public class bmiActivity extends AppCompatActivity {
    public void tl_backtongquat(View view){
        Intent intent = new Intent(this,tongquatActivity.class);
        this.startActivity(intent);
    }
    private static final  String TAG = "bmiActivity";
    DatabaseHelper mDatabaseHelper;
    private TextView age;
    private TextView weight;
    private AppCompatSeekBar seekBar;
    private TextView height_value;
    public void tl_list(View view){
        Intent intent = new Intent(this,ListActivity.class);
        this.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmilayout);
        age = findViewById(R.id.age);
        weight = findViewById(R.id.weight);
        seekBar = findViewById(R.id.seek_bar);
        seekBar.setOnSeekBarChangeListener(listener);
        height_value = findViewById(R.id.height_value);
        mDatabaseHelper = new DatabaseHelper(this);

    }

    private SeekBar.OnSeekBarChangeListener listener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean FromUser) {
            height_value.setText(String.format("%d Cm", progress));
        }
        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }
        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    };

    public void increaseAge(View view) {
        if (Integer.parseInt(age.getText().toString()) > 0){
            int age_value = Integer.parseInt(age.getText().toString()) + 1;
            age.setText(String.valueOf(age_value));
        }

    }

    public void decreaseAge(View view) {
        if (Integer.parseInt(age.getText().toString()) > 1) {
            int age_value = Integer.parseInt(age.getText().toString()) - 1;
            age.setText(String.valueOf(age_value));
        }
    }

    public void increaseWeight(View view) {
        if (Integer.parseInt(weight.getText().toString()) > 0){
            int weight_value = Integer.parseInt(weight.getText().toString()) + 1;
            weight.setText(String.valueOf(weight_value));
        }
    }

    public void decreaseWeight(View view) {
        if (Integer.parseInt(weight.getText().toString()) > 1){
            int weight_value = Integer.parseInt(weight.getText().toString()) - 1;
            weight.setText(String.valueOf(weight_value));
        }
    }
    //13/11/2022
    public void AddData(Integer newEntry) {
        boolean insertData = mDatabaseHelper.addData(newEntry);
    }

    public void showResult(View view) {
        int get_age = Integer.parseInt(age.getText().toString());
        int weight_value = Integer.parseInt(weight.getText().toString());
        double get_height = (double)seekBar.getProgress()/ 100;

        int bmi = (int) (weight_value /(get_height * get_height));

        AddData(bmi);

        showBMI(bmi);
    }
// 14/10
    private void showBMI(int bmi) {

        if (bmi < 18.5){
            showCustomDialog(R.drawable.underweight, "Nhẹ cân", "Bổ sung chất dinh dưỡng" );
        }else if (bmi > 18.5 && bmi < 24.9){
            showCustomDialog(R.drawable.normalweight, "Bình thường", "Cơ thể khỏe mạnh" );
        }else {
            showCustomDialog(R.drawable.overweight, "Thừa cân", "Tập thể dục nhiều hơn" );
        }

    }

    private void showCustomDialog(int id, String title, String tip) {

        ViewGroup viewGroup = findViewById(android.R.id.content);
        View view = LayoutInflater.from(this).inflate(R.layout.custom_dialog, viewGroup, false);
        AppCompatButton ok = view.findViewById(R.id.ok);
        ImageView imageView = view.findViewById(R.id.image_bmi);
        TextView result_title = view.findViewById(R.id.result_title);
        TextView tips = view.findViewById(R.id.tips);
        imageView.setImageResource(id);
        result_title.setText(title);
        tips.setText(tip);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(view);

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
    }

}