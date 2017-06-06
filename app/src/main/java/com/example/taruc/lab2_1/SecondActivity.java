package com.example.taruc.lab2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Array;

public class SecondActivity extends AppCompatActivity {
    private TextView textViewMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewMessage = (TextView) findViewById(R.id.textViewMessage);

        Bundle extras = getIntent().getExtras();
        if(!extras.isEmpty()){
            textViewMessage.setText((String) extras.getString("MESSAGE"));
        }

    }
}
