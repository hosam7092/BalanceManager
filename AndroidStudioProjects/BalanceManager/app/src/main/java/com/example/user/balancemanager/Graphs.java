package com.example.user.balancemanager;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class Graphs extends AppCompatActivity {
CircleMenu c;
String array[] = {"bars","chart","dots","line","limit","lineBars"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphs);
        c = (CircleMenu)findViewById(R.id.menu);
        c.setMainMenu(Color.parseColor("#CDCDCD"), R.drawable.plusicon, R.drawable.minusicon)
                .addSubMenu(Color.parseColor("#FFFFFF"),R.drawable.bluebars)
                .addSubMenu(Color.parseColor("#FFFFFF"),R.drawable.bluechart)
                .addSubMenu(Color.parseColor("#FFFFFF"),R.drawable.bluedots)
                .addSubMenu(Color.parseColor("#FFFFFF"),R.drawable.blueline)
                .addSubMenu(Color.parseColor("#FFFFFF"),R.drawable.limit)
                .addSubMenu(Color.parseColor("#FFFFFF"),R.drawable.linebars)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int i) {
                        if (i == 0){
                            Intent ig = new Intent(Graphs.this, BarsGraph.class);
                            startActivity(ig);
                        }
                        else if (i == 1){
                            Intent ig = new Intent(Graphs.this, ChartGraph.class);
                            startActivity(ig);
                        }
                        else if (i == 2){
                            Intent ig = new Intent(Graphs.this, DotsGraph.class);
                            startActivity(ig);
                        }
                        else if (i == 3){
                            Intent ig = new Intent(Graphs.this, LineGraph.class);
                            startActivity(ig);
                        }
                        else if (i == 4){
                            Intent ig = new Intent(Graphs.this, LimitGraph.class);
                            startActivity(ig);
                        }
                        else if (i == 5){
                            Intent ig = new Intent(Graphs.this, LineBarsGraph.class);
                        }
                    }
                });

    }
}
