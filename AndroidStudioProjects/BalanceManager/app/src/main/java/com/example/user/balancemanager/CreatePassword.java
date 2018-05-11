package com.example.user.balancemanager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreatePassword extends AppCompatActivity {

    EditText pass;
    EditText confirm;
    Button passBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_password);
        pass = (EditText)findViewById(R.id.password);
        confirm = (EditText)findViewById(R.id.comfirmpassword);
        passBtn = (Button)findViewById(R.id.passwordBtn);
        passBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = pass.getText().toString();
                String c = confirm.getText().toString();

                if (p.equals("")||c.equals("")){
                    Toast.makeText(CreatePassword.this, "No Password Was Entered !", Toast.LENGTH_SHORT).show();
                }else{
                    if(p.equals(c)){
                        SharedPreferences settings = getSharedPreferences("PREFS", 0);
                        SharedPreferences.Editor editor = settings.edit();
                        editor.putString("password", p);
                        editor.apply();

                        //can access!
                        Intent i = new Intent(CreatePassword.this, Manager.class);
                        startActivity(i);
                    }else{
                        Toast.makeText(CreatePassword.this, "Password Not Match!", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });
    }
}
