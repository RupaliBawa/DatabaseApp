package com.example.hp.databaseapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.button) {
            Intent in=new Intent(this, Activity2.class);
            startActivity(in);
        }
        else if(view.getId()==R.id.button2) {
            Intent in=new Intent(this,Activity3.class);
            startActivity(in);
        }
        else if(view.getId()==R.id.button4) {
            Intent in=new Intent(this, Activity4.class);
            startActivity(in);
        }
        else if(view.getId()==R.id.button3) {
            Intent in=new Intent(this, Activity5.class);
            startActivity(in);
        }

    }
}
