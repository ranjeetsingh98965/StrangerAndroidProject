package com.android.stranger.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.stranger.R;
import com.google.firebase.auth.FirebaseAuth;

public class WelcomeActivity extends AppCompatActivity {

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        auth  = FirebaseAuth.getInstance();

        if(auth.getCurrentUser() != null) {
            gotoNextActivity();
        }

        findViewById(R.id.getStarted).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoNextActivity();
            }
        });
    }

    void gotoNextActivity()
    {
        startActivity(new Intent(WelcomeActivity.this, LoginActivity.class));
        finish();
    }
}












