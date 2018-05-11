package com.example.user.balancemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChartGraph extends AppCompatActivity {


    Button chart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_graph);
        chart = (Button)findViewById(R.id.chartBackBtn);
        chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(ChartGraph.this, Graphs.class);
                startActivity(it);
            }
        });
    }
}
