package com.example.ap3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView t1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.edtno1);
        e2 = findViewById(R.id.edtno2);

        t1 = findViewById(R.id.txtans);

        b1 = findViewById(R.id.btnaddition);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (e1.getText().toString().equals(""))
                {
                    e1.setError("Please enter number");
                }
                else if (e2.getText().toString().equals(""))
                {
                    e2.setError("Please enter number");
                }
                else {
                    String a = e1.getText().toString();
                    String b = e2.getText().toString();

                    int aa = Integer.parseInt(a);
                    int bb = Integer.parseInt(b);

                    int c = aa + bb;

                    t1.setText("" + c);
                }

            }
        });
    }
}