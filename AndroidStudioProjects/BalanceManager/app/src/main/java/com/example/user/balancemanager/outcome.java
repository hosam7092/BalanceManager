package com.example.user.balancemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.user.balancemanager.welcome.l;

public class outcome extends AppCompatActivity {
    Button home;
    Button btnInComes;
    EditText amountInComes;
    EditText dealsNameInComes;
    EditText categoryInComes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outcome);
        amountInComes = (EditText) findViewById(R.id.amountoutComes);
        dealsNameInComes = (EditText) findViewById(R.id.dealsNameoutComes);
        categoryInComes = (EditText) findViewById(R.id.categoryoutComes);
        btnInComes = (Button) findViewById(R.id.btnoutComes);
        home = (Button)findViewById(R.id.home1);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(outcome.this, Manager.class);
                startActivity(i);
            }
        });
        btnInComes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = amountInComes.getText().toString();
                double amount = (-1)*Double.parseDouble(s);
                String dealsName = dealsNameInComes.getText().toString();
                String category = categoryInComes.getText().toString();
                if(s.equals("")||dealsName.equals("")||category.equals(""))
                {
                    Toast.makeText(outcome.this, "Missing Data Was Entered !", Toast.LENGTH_SHORT).show();
                }
                else{
                    Helper.actions(amount, dealsName, category, l);
                    Intent h= new Intent(outcome.this,Manager.class);
                    startActivity(h);
                }
            }
        });
    }
}