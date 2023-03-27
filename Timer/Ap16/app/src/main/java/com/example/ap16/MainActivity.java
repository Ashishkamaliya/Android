package com.example.ap16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Chronometer c;
    int i=0;
    int duration=10;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c=(Chronometer)findViewById(R.id.cnm);
        tv=(TextView)findViewById(R.id.tv);
        c.start();
        c.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer arg0) {

                tv.setText("Next screen will be displayed after " + (duration - (i + 1)) + " seconds");
                i++;
                if (i >= duration)
                {
                    Intent i = new Intent(getApplicationContext(),SecondActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}