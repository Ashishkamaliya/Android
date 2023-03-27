package com.example.ap5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class homeActivity extends AppCompatActivity {

    TextView txt;
    public static final String Username="Username";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txt=findViewById(R.id.txtusn);

        Intent i = getIntent();
        String Usn = i.getStringExtra(Username);

        txt.setText("Username: "+Usn);
    }
}