package com.example.user.balancemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import static com.example.user.balancemanager.FinancialLoan.f;
import static com.example.user.balancemanager.FinancialLoan.counter;

public class AddingLoan extends AppCompatActivity {
    Button add;
    EditText amount;
    EditText interest;
    EditText perpayment;
    EditText manypayments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_loan);
        amount = (EditText)findViewById(R.id.amount);
        interest = (EditText)findViewById(R.id.interest);
        perpayment = (EditText)findViewById(R.id.perpayment);
        manypayments = (EditText)findViewById(R.id.manypayments);





        add = (Button)findViewById(R.id.addbtn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double amount1 = Double.parseDouble(amount.getText().toString());
                double interest1 = 0.01*Double.parseDouble(interest.getText().toString());
                double perpayment1 = Double.parseDouble(perpayment.getText().toString());
                int manypayments1 = Integer.parseInt(manypayments.getText().toString());
                f[counter] = new FinancialLoan1(amount1, interest1, perpayment1, manypayments1);/////////////////////////////////////////
                counter = counter + 1;
                Intent i = new Intent(AddingLoan.this , FinancialLoan.class);
                startActivity(i);
            }
        });

    }
}
