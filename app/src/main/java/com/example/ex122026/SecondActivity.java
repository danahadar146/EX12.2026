package com.example.ex122026;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView tvWin,tvRed,tvBlue;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        tvWin= (TextView) findViewById(R.id.tvWin);
        tvRed= (TextView) findViewById(R.id.tvRed);
        tvBlue= (TextView) findViewById(R.id.tvBlue);
        reset=(Button) findViewById(R.id.reset);

        Intent si=getIntent();
        int red=si.getIntExtra("red",0);
        int blue=si.getIntExtra("blue",0);

        tvRed.setText("red: "+red);
        tvBlue.setText("blue: "+blue);
        if (red>blue){
            tvWin.setText("Red won the game!");
        }
        else if(red==blue){
            tvWin.setText("Its a tie!");
        }
        else{
            tvWin.setText("Blue won the game!");
        }
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}