package com.example.user.balancemanager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //load password
        SharedPreferences settings = getSharedPreferences("PREFS", 0);
        password = settings.getString("password", "");

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (password.equals(""))
                {
                    Intent in = new Intent(SplashActivity.this, CreatePassword.class);
                    startActivity(in);
                }
                else{
                    Intent in = new Intent(getApplicationContext(), EnterPassword.class);
                    startActivity(in);
                    finish();
                }
            }
        }, 1000);
    }
}
