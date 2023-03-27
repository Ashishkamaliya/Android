package com.example.ap4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add,mul,div,sub,clr;
    TextView ans;
    EditText no1,no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        add = findViewById(R.id.btnadd);
        mul = findViewById(R.id.btnmul);
        div = findViewById(R.id.btndiv);
        sub = findViewById(R.id.btnsub);
        clr = findViewById(R.id.btnclear);

        ans = findViewById(R.id.txtans);

        no1 = findViewById(R.id.edtno1);
        no2 = findViewById(R.id.edtno2);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (no1.getText().toString().equals(""))
                {
                    no1.setError("Please enter number");
                }
                else if (no2.getText().toString().equals(""))
                {
                    no2.setError("Please enter number");
                }
                else {

                    int a = Integer.parseInt(no1.getText().toString());
                    int b = Integer.parseInt(no2.getText().toString());

                    int c = a + b;

                    ans.setText("Ans: " + c);
                }
            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (no1.getText().toString().equals(""))
                {
                    no1.setError("Please enter number");
                }
                else if (no2.getText().toString().equals(""))
                {
                    no2.setError("Please enter number");
                }
                else {

                    int a = Integer.parseInt(no1.getText().toString());
                    int b = Integer.parseInt(no2.getText().toString());

                    int c = a * b;

                    ans.setText("Ans: " + c);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (no1.getText().toString().equals(""))
                {
                    no1.setError("Please enter number");
                }
                else if (no2.getText().toString().equals(""))
                {
                    no2.setError("Please enter number");
                }
                else {

                    int a = Integer.parseInt(no1.getText().toString());
                    int b = Integer.parseInt(no2.getText().toString());

                    int c = a / b;

                    ans.setText("Ans: " + c);
                }
            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (no1.getText().toString().equals(""))
                {
                    no1.setError("Please enter number");
                }
                else if (no2.getText().toString().equals(""))
                {
                    no2.setError("Please enter number");
                }
                else {

                    int a = Integer.parseInt(no1.getText().toString());
                    int b = Integer.parseInt(no2.getText().toString());

                    int c = a - b;

                    ans.setText("Ans: " + c);
                }
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                no1.setText("");
                no2.setText("");
                ans.setText("");

            }
        });

    }
}