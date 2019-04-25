package com.example.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // TODO 2.0: add your appropriate variables here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        addAction();
    }

    private void addAction() {
        //TODO 2.2: add OnClickListenter for your button here
    }

    private void initView() {
        //TODO 2.1: map the view with appropriate variable
    }

    @Override
    public void onClick(View v) {
        // TODO 2.3: add your handle when you enter your name and hit submit button
    }
}
