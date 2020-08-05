package com.belajar.androidbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.belajar.androidbasic.numberone.FirstActivity;
import com.belajar.androidbasic.numberthree.ThirdActivity;
import com.belajar.androidbasic.numbertwo.SecondActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnOne, btnTwo, btnThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = findViewById(R.id.numberone);
        btnTwo = findViewById(R.id.numbertwo);
        btnThree = findViewById(R.id.numberthree);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.numberone:
                Intent one = new Intent(getApplicationContext(), FirstActivity.class);
                startActivity(one);
                break;

            case R.id.numbertwo:
                Intent two = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(two);
                break;
            case R.id.numberthree:
                Intent three = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(three);
                break;
        }
    }
}