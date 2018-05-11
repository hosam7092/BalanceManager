package com.example.user.balancemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinancialLoan extends AppCompatActivity {

    public static FinancialLoan1[] f;
    public static int counter = 0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial_loan);
        home = (Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FinancialLoan.this, Manager.class);
                startActivity(i);
            }
        });
        Button addingbtn = (Button)findViewById(R.id.btnadd);
        addingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FinancialLoan.this, AddingLoan.class);
                startActivity(i);
            }
        });
        if(counter == 1){
            btn1 = findViewById(R.id.firstLoan);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(FinancialLoan.this, FirstLoan.class);
                    startActivity(i);
                }
            });
        }else if(counter == 2){
            btn1 = findViewById(R.id.firstLoan);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(FinancialLoan.this, FirstLoan.class);
                    startActivity(i);
                }
            });
            btn2 = findViewById(R.id.secondLoan);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(FinancialLoan.this, SecondLoan.class);
                    startActivity(i);
                }
            });
        }else if(counter == 3){
            btn1 = findViewById(R.id.firstLoan);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(FinancialLoan.this, FirstLoan.class);
                    startActivity(i);
                }
            });
            btn2 = findViewById(R.id.secondLoan);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(FinancialLoan.this, SecondLoan.class);
                    startActivity(i);
                }
            });
            btn3 = findViewById(R.id.thirdLoan);
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(FinancialLoan.this, ThirdLoan.class);
                    startActivity(i);
                }
            });
        }
    }
}
