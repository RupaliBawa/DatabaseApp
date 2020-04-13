package com.example.hp.databaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    EditText e1, e2, e3;
    Button b;
    db obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        b=(Button)findViewById(R.id.button5);
        obj=new db(this);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String username=e1.getText().toString();
        String address=e2.getText().toString();
        String phone=e3.getText().toString();

        boolean b=obj.addData(username,address,phone);

        if(b) {
            Toast.makeText(this,"Data Added",Toast.LENGTH_SHORT).show();
            e1.setText(null);
            e2.setText(null);
            e3.setText(null);
        }

    }
}
