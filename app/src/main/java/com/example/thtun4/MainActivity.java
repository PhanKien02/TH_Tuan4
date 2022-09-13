package com.example.thtun4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Login");

//        register User
        Button textViewRegister = findViewById(R.id.txt_regiter);
        textViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerActivity = new Intent(MainActivity.this,SingupActivity.class);
                startActivity(registerActivity);
            }
        });
        Button btnLogin = findViewById(R.id.log_in);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerActivity = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(registerActivity);
            }
        });
    }
}