package com.example.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // TODO 2.0: add your appropriate variables here
    private Button mButtonSubmit;
    private TextView mTextResult;
    private EditText mTextInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        addAction();
    }

    private void addAction() {
        //TODO 2.2: add OnClickListenter for your button here
        mButtonSubmit.setOnClickListener(this);
    }

    private void initView() {
        //TODO 2.1: map the view with appropriate variable
        mButtonSubmit = findViewById(R.id.button_submit);
        mTextInput = findViewById(R.id.edit_input);
        mTextResult = findViewById(R.id.text_result);
    }

    @Override
    public void onClick(View v) {
        // TODO 2.3: add your handle when you enter your name and hit submit button
        String input = mTextInput.getText().toString();
        mTextResult.setText(getResources().getString(R.string.message) +
                ' ' + input + '!' + getResources().getString(R.string.nice_day_msg));
    }
}
