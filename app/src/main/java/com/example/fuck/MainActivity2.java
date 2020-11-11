package com.example.fuck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText mTextView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mTextView = (EditText) findViewById(R.id.editText);
        button=(Button)findViewById(R.id.buttonmessage);

    }
    public void SendMessage(View view) {
        String message=mTextView.getText().toString();
        Intent returnmessage =new Intent();
        returnmessage.putExtra("MESSAGE",message);
        setResult(1,returnmessage);
        finish();
    }
}