package com.example.studentinterfaceapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StudentLogin extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    TextView textView;
    Button button;

    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
    }

}
