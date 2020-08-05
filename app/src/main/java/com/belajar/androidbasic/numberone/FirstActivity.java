package com.belajar.androidbasic.numberone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.belajar.androidbasic.R;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener{
    EditText editNama;
    Button submit;
    String nameOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        editNama = findViewById(R.id.nama);
        submit = findViewById(R.id.confirm);

        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        nameOutput = editNama.getText().toString();
        switch (view.getId()) {
            case R.id.confirm:
                Intent submit = new Intent(getApplicationContext(), DetailActivity.class);
                submit.putExtra("result", nameOutput);
                finish();
                startActivity(submit);
                break;
        }
    }
}