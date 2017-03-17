package com.example.mac.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import org.json.simple.JSONArray;


public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JSONArray jsonArray=new JSONArray();
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
    }
}
