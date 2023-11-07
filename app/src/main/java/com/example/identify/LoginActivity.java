package com.example.identify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    TextInputLayout layoutEmail, layoutPassword;
    TextInputEditText edtEmail, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        layoutEmail = findViewById(R.id.layoutEmail);
        edtEmail = findViewById(R.id.edtEmail);
        layoutPassword = findViewById(R.id.layoutPassword);
        edtPassword = findViewById(R.id.edtPassword);





    }


}