package com.example.user.balancemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.user.balancemanager.welcome.l;

public class InCome extends AppCompatActivity {
    Button home;
    Button btnInComes;
    EditText amountInComes;
    EditText dealsNameInComes;
    EditText categoryInComes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_come);
        home = (Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InCome.this, Manager.class);
                startActivity(i);
            }
        });
        amountInComes = (EditText) findViewById(R.id.amountInComes);
        dealsNameInComes = (EditText) findViewById(R.id.dealsNameInComes);
        categoryInComes = (EditText) findViewById(R.id.categoryInComes);
        btnInComes = (Button) findViewById(R.id.btnInComes);
        btnInComes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = amountInComes.getText().toString();
                double amount = Double.parseDouble(s);
                String dealsName = dealsNameInComes.getText().toString();
                String category = categoryInComes.getText().toString();
                if((!dealsName.equals(""))||(!category.equals(""))||(!s.equals("")))
                {
                    Helper.actions(amount, dealsName, category, l);
                    Intent h= new Intent(InCome.this,Manager.class);
                    startActivity(h);

                }
                else{
                    Toast.makeText(InCome.this, "Missing Data Was Entered !", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }}
