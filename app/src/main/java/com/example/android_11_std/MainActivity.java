package com.example.android_11_std;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView ans_txt;
    Button ac_btn, close_btn, multi_btn, seven_btn, eigth_btn, nine_btn, equal_btn;
    int a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding();

        seven_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = ans_txt.getText().toString();
                ans_txt.setText(temp + "7");
            }
        });


        nine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = ans_txt.getText().toString();
                ans_txt.setText(temp + "9");
                b=9;
            }
        });

        multi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = ans_txt.getText().toString();
                a = Integer.parseInt(temp);
                ans_txt.setText(temp + "+");
            }
        });

        eigth_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = ans_txt.getText().toString();

                b = 8;
                ans_txt.setText(temp + "8");
            }
        });

        equal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multification();
            }
        });

        ac_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans_txt.setText("");
            }
        });


    }


    void binding() {
        ans_txt = findViewById(R.id.ans_txt);
        ac_btn = findViewById(R.id.ac_btn);
        close_btn = findViewById(R.id.close_btn);
        multi_btn = findViewById(R.id.multi_btn);
        seven_btn = findViewById(R.id.seven_btn);
        eigth_btn = findViewById(R.id.eight_btn);
        nine_btn = findViewById(R.id.nine_btn);
        equal_btn = findViewById(R.id.equal_btn);
    }


    void multification() {
        int c = a + b;
        ans_txt.setText(c + "");
    }



}