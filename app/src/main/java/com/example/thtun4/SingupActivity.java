package com.example.thtun4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SingupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        getSupportActionBar().setTitle("Sing up");

      //  singin User
        TextView textViewRegister = findViewById(R.id.txt_singin);
        textViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerActivity = new Intent(SingupActivity.this,MainActivity.class);
                startActivity(registerActivity);
            }
        });
    }
}