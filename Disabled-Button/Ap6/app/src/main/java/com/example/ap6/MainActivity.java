package com.example.ap6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1;

    private TextWatcher mTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String ed1 = txt1.getText().toString();
            String ed2 = txt2.getText().toString();

            btn1.setEnabled(!ed1.equals("")&&!ed2.equals(""));
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.TxtUsn);
        txt2 = findViewById(R.id.TxtPass);
        btn1 = findViewById(R.id.BtnLogin);

        btn1.setEnabled(!txt1.getText().toString().equals("")&&!txt2.getText().toString().equals(""));
        txt1.addTextChangedListener(mTextWatcher);
        txt2.addTextChangedListener(mTextWatcher);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1.getText().toString().equals("Ashish")&&txt2.getText().toString().equals("Ashish"))
                {
                    Toast.makeText(getApplicationContext(),"Login Successfull..",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Credentials..",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}