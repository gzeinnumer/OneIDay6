package com.gzeinnumer.oneiday6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SessionExampleActivity extends AppCompatActivity {

    SessionManager sessionManager;

    private static final String TAG = "aDaASFASFASFAS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session_example);
        sessionManager = new SessionManager(getApplicationContext());

        sessionManager.setUsername("Zein");

        Log.d(TAG, "onCreate: "+sessionManager.getUsername());

        if (sessionManager.getUsername().equals("Zein")){
            Toast.makeText(getApplicationContext(), "hello zein", Toast.LENGTH_SHORT).show();
        }
    }
}