package com.example.user.balancemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
public class welcome extends AppCompatActivity {
    ImageButton history;
    ImageButton graphs;
    ImageButton plusBtn;
    ImageButton minusBtn;
    public static History_Linked_List l = new History_Linked_List();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        minusBtn = (ImageButton)findViewById(R.id.minusBtn);
        plusBtn = (ImageButton)findViewById(R.id.plusBtn);
        history = (ImageButton)findViewById(R.id.history);
        graphs = (ImageButton)findViewById(R.id.graphs);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(welcome.this, HistoryShow.class);
                startActivity(inte);
            }
        });
        graphs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(welcome.this, Graphs.class);
                startActivity(a);
            }
        });
        minusBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in = new Intent(welcome.this, outcome.class);
                startActivity(in);
            }
        });
        plusBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(welcome.this, InCome.class);
                startActivity(i);
            }
        });


    }
}
