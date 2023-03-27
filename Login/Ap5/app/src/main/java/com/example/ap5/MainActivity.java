package com.example.ap5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.TxtUsn);
        txt2 = findViewById(R.id.TxtPass);
        btn1 = findViewById(R.id.BtnLogin);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1.getText().toString().equals("Ashish")&&txt2.getText().toString().equals("Ashish"))
                {
                    Intent i = new Intent(getApplicationContext(),homeActivity.class);
                    i.putExtra(homeActivity.Username,txt1.getText().toString().trim());
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Login Failed..",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}