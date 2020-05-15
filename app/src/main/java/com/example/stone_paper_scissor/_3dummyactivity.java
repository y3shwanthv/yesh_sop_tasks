package com.example.stone_paper_scissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class _3dummyactivity extends AppCompatActivity {

    private Button bt_0;
    private Button bt_1;
    private Button bt_2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__3dummyactivity);

        final GlobalClass globalClass = (GlobalClass) getApplicationContext();
        String player2;
        player2 = globalClass.getP2name();
        textView = (TextView) findViewById(R.id.player2name_text);
        textView.setText(player2);

        bt_0 = (Button) findViewById(R.id.p2_0turn_0);
        bt_1 = (Button) findViewById(R.id.p2_0turn_1);
        bt_2 = (Button) findViewById(R.id.p2_0turn_2);

        bt_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                open_main6();
            }
        });
        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                open_main5();
            }
        });
        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                open_main4();
            }
        });
    }
    public void open_main6(){
        Intent intent = new Intent(this,Main6Activity.class);
        startActivity(intent);
    }
    public void open_main5(){
        Intent intent = new Intent(this,Main5Activity.class);
        startActivity(intent);
    }
    public void open_main4(){
        Intent intent = new Intent(this,Main4Activity.class);
        startActivity(intent);
    }
}
