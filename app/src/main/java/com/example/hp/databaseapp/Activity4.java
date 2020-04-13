package com.example.hp.databaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity4 extends AppCompatActivity implements View.OnClickListener{

    EditText e1, e2;
    Button b;
    db obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        e1=(EditText)findViewById(R.id.editText4);
        e2=(EditText)findViewById(R.id.editText5);
        b=(Button)findViewById(R.id.button6);

        obj=new db(this);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String s=e1.getText().toString();
        String s1=e2.getText().toString();

        boolean b=obj.updateData(s,s1);

        if(b) {
            Toast.makeText(this,"Data Updated",Toast.LENGTH_SHORT).show();
            e1.setText(null);
            e2.setText(null);
        }

    }
}
