package com.example.hp.databaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity5 extends AppCompatActivity implements View.OnClickListener{

    EditText e;
    Button b;
    db obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        e=(EditText)findViewById(R.id.editText6);
        b=(Button)findViewById(R.id.button7);

        obj=new db(this);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String s=e.getText().toString();

        boolean b=obj.deleteData(s);

        if(b) {
            Toast.makeText(this,"Data deleted",Toast.LENGTH_SHORT).show();
        }
    }
}
