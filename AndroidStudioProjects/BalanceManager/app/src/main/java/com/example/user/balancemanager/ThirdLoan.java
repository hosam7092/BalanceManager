package com.example.user.balancemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.example.user.balancemanager.FinancialLoan.f;

public class ThirdLoan extends AppCompatActivity {

    TextView npay;
    TextView agot;
    TextView date;
    TextView perc;
    TextView intamount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_loan);

        npay = findViewById(R.id.npay);
        agot = findViewById(R.id.agot);
        date = findViewById(R.id.date);
        perc = findViewById(R.id.perc);
        intamount = findViewById(R.id.intamount);

        npay.setText(String.valueOf(f[2].getTotal()));
        agot.setText(String.valueOf(f[2].getAmount()));
        Date d = f[2].getDate();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        String reportDate = df.format(d);
        TextView date = findViewById(R.id.Date);
        date.setText(reportDate);
        perc.setText(String.valueOf(f[2].getInterest()));
        intamount.setText(String.valueOf(f[2].getTotal()-f[2].getAmount()));
    }
}
