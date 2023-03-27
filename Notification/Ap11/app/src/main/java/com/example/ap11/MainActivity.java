package com.example.ap11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PendingIntent p = PendingIntent.getActivity(getApplicationContext(),0,new Intent(MainActivity.this,MainActivity.class),0,null);

                Notification notification = new NotificationCompat.Builder(getApplicationContext())
                        .setTicker("Ticker")
                        .setContentTitle("Notification")
                        .setContentText("Hello Message..")
                        .setContentIntent(p)
                        .setAutoCancel(true)
                        .build();

                NotificationManager n = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

                n.notify(0,notification);
            }
        });
    }
}