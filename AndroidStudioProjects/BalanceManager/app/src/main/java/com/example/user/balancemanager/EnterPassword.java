package com.example.user.balancemanager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EnterPassword extends AppCompatActivity {
    EditText password;
    Button passBtn;

    String truePass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_password);

        SharedPreferences settings = getSharedPreferences("PREFS", 0);
        truePass = settings.getString("password", "");
        password = (EditText)findViewById(R.id.password1);
        passBtn = (Button)findViewById(R.id.passwordBtn1);
        passBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = password.getText().toString();

                if (text.equals(truePass))
                {
                    Intent i = new Intent(EnterPassword.this, Manager.class);
                    startActivity(i);
                }else{
                    Toast.makeText(EnterPassword.this, "Password Not Match!", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
