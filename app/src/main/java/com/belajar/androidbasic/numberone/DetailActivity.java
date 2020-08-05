package com.belajar.androidbasic.numberone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.belajar.androidbasic.R;

public class DetailActivity extends AppCompatActivity {
    TextView nameOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        nameOutput = findViewById(R.id.outputnama);

        Intent result = getIntent();
        nameOutput.setText(result.getStringExtra("result"));
    }
}