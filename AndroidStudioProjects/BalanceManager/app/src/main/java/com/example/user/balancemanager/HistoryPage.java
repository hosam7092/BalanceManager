package com.example.user.balancemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import static com.example.user.balancemanager.welcome.l;

public class HistoryPage extends AppCompatActivity {

    TextView history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_page);
        history = findViewById(R.id.history);
        history.setMovementMethod(new ScrollingMovementMethod());
        history.setHint(l.getInfo());
        history.setMovementMethod(new ScrollingMovementMethod());
    }
}
