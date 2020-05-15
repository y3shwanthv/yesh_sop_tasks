package com.example.stone_paper_scissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Main5Activity extends AppCompatActivity {

    Timer timer;
    TextView textView;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        textView = (TextView) findViewById(R.id.who_lost);
        final GlobalClass globalClass = (GlobalClass) getApplicationContext();
        textView.setText(globalClass.getP1name());

        tv = (TextView) findViewById(R.id.score_duo_lost);
        int y; String z;
        y = globalClass.getP1score();
        z = String.valueOf(y);
        tv.setText(z);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent = new Intent(Main5Activity.this,Main9Activity.class);
                startActivity(intent);
                finish();


            }
        },1000);

    }

}
