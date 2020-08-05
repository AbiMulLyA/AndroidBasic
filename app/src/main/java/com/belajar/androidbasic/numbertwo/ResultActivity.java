package com.belajar.androidbasic.numbertwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.belajar.androidbasic.R;
import com.belajar.androidbasic.numberone.DetailActivity;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener{
    EditText resultText;
    Button sendButton;
    String outputResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultText = findViewById(R.id.resultText);
        sendButton = findViewById(R.id.send);

        sendButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        outputResult = resultText.getText().toString();
        switch (view.getId()){
            case R.id.send:
                Intent submit = new Intent(getApplicationContext(), SecondActivity.class);
                submit.putExtra("result", outputResult);
                finish();
                startActivity(submit);
                break;
        }
    }
}