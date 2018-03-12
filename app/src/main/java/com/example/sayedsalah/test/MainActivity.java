package com.example.sayedsalah.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //start this comment for text
        Toast.makeText(this, "12345", Toast.LENGTH_SHORT).show();
    }
}
