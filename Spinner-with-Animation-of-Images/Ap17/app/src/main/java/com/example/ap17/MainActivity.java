package com.example.ap17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    ImageView img;
    Button stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.spinnerImage);
        img = findViewById(R.id.imageView);
        stop = findViewById(R.id.btnStop);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);
                    img.startAnimation(animation);
                }
                else if(i == 1){
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);
                    img.startAnimation(animation);
                }
                else if(i == 2){
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_animation);
                    img.startAnimation(animation);
                }
                else if(i == 3){
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_animation);
                    img.startAnimation(animation);
                }
                else if(i == 4){
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_animation);
                    img.startAnimation(animation);
                }
                else{
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_animation);
                    img.startAnimation(animation);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.clearAnimation();
            }
        });
    }
}