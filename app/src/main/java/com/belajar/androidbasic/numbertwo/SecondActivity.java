package com.belajar.androidbasic.numbertwo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.belajar.androidbasic.R;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    Button next;
    TextView outputResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        next = findViewById(R.id.next);
        outputResult = findViewById(R.id.outputResult);
        next.setOnClickListener(this);

        Intent result = getIntent();
        outputResult.setText(result.getStringExtra("result"));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.next:
                Intent next = new Intent(SecondActivity.this, ResultActivity.class);
                startActivity(next);
                break;
        }
    }
}