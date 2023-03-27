package com.example.ap14;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = findViewById(R.id.relativeLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mymenu = getMenuInflater();
        mymenu.inflate(R.menu.mainmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.purple){
            r.setBackgroundResource(R.color.purple);
        }
        if(item.getItemId() == R.id.blue){
            r.setBackgroundResource(R.color.blue);
        }
        if(item.getItemId() == R.id.skyblue){
            r.setBackgroundResource(R.color.skyblue);
        }
        if(item.getItemId() == R.id.green){
            r.setBackgroundResource(R.color.green);
        }
        if(item.getItemId() == R.id.yellow){
            r.setBackgroundResource(R.color.yellow);
        }
        if(item.getItemId() == R.id.orange){
            r.setBackgroundResource(R.color.orange);
        }
        if(item.getItemId() == R.id.red){
            r.setBackgroundResource(R.color.red);
        }
        return super.onOptionsItemSelected(item);
    }
}