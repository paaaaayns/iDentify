package com.example.identify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectActivity(LoginActivity.class);
            }
        });
    }

    public void redirectActivity(Class secondActivity) {
        Intent intent = new Intent(getApplicationContext(), secondActivity);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_up_in, R.anim.slide_up_out);
    }

    private boolean confirmExit = false;
    @Override
    public void onBackPressed() {
        if (confirmExit) {
            // Close the application
            finishAffinity();
            System.exit(0);
            return;
        }

        this.confirmExit = true;
        Toast.makeText(this, "Press back again if you want to exit the application.", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                confirmExit = false;
            }
        }, 3000); // Set the time interval for the user to press back again (in milliseconds)
    }
}