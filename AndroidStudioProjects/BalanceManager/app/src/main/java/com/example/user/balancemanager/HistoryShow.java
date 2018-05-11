package com.example.user.balancemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.example.user.balancemanager.welcome.l;

public class HistoryShow extends AppCompatActivity {
    TextView balanceTotal;
    Button btn;
    Button home;
    ImageButton plusBtn;
    ImageButton minusBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_show);
        balanceTotal = findViewById(R.id.balanceTotal);
        balanceTotal.setHint(Double.toString(l.theMoneyUHave()));
        Date d = Calendar.getInstance().getTime();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        String reportDate = df.format(d);
        TextView date = findViewById(R.id.Date);
        date.setText(reportDate);
        btn = findViewById(R.id.btnhis);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HistoryShow.this, HistoryPage.class);
                startActivity(i);
            }
        });
        minusBtn = (ImageButton)findViewById(R.id.minusBtn);
        plusBtn = (ImageButton)findViewById(R.id.plusBtn);
        minusBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in = new Intent(HistoryShow.this, outcome.class);
                startActivity(in);
            }
        });
        plusBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(HistoryShow.this, InCome.class);
                startActivity(i);
            }
        });
        home = (Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HistoryShow.this, Manager.class);
                startActivity(i);
            }
        });
    }
}
