package com.example.ex122026;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {

    Button shortBtn,longBtn,finish;
    int longMone;
    int shortMone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        shortBtn=(Button) findViewById(R.id.shortBtn);
        longBtn=(Button) findViewById(R.id.longBtn);
        finish=(Button) findViewById(R.id.finish);
        longMone=0;
        shortMone=0;

        shortBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shortMone++;
            }
        });

        longBtn.setOnLongClickListener(this);
    }

    @Override
    public boolean onLongClick(View v) {
        longMone+=2;
        return true;
    }

    public void goWithData(View view){
    Intent si=new Intent(this,SecondActivity.class);
    si.putExtra("red",longMone);
    si.putExtra("blue",shortMone);
    startActivity(si);

    }
    @Override
    protected void onResume() {
        super.onResume();
        longMone=0;
        shortMone=0;
    }
}