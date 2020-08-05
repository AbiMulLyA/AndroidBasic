package com.belajar.androidbasic.numberthree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.belajar.androidbasic.R;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener{
    EditText email, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.login);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(email.getText().toString().length() == 0 || password.getText().toString().length() == 0){
            Toast.makeText(getApplicationContext(), "Email atau Pasword tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }else if(!password.getText().toString().matches("[A-Za-z0-9]+")){
            password.setError("Password hanya boleh mengandung alphanumeric");
        }else if(password.getText().toString().length() < 8){
            password.setError("Panjang password tidak boleh kurang dari 8 karakter");
        }else{   Intent three = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(three);
         }
    }
}