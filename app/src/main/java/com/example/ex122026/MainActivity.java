package com.example.ex122026;

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

    Button shortBtn,longBtn;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        shortBtn=(Button) findViewById(R.id.shortBtn);
        longBtn=(Button) findViewById(R.id.longBtn);
        i=0;

        shortBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
            }
        });

        longBtn.setOnLongClickListener(this);
    }

    @Override
    public boolean onLongClick(View v) {
        i+=2;
        return true;
    }

    public void goWithData(View view){
    Intent si=new Intent(this,SecondActivity.class);
    si.putExtra(i,0);

    }
}