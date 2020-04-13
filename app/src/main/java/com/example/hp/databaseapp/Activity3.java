package com.example.hp.databaseapp;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    TextView tv;

    db obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        tv=(TextView)findViewById(R.id.textView);
        obj=new db(this);
        Cursor c=obj.showData();

        if(c.moveToFirst()) {

            do {
               String u= c.getString(c.getColumnIndex("username"));
               String a= c.getString(c.getColumnIndex("address"));
               String p= c.getString(c.getColumnIndex("phone"));

               tv.setText(tv.getText()+"\n\nName: "+u+"  Address: "+a+"  Phone: "+p);
            } while(c.moveToNext());
        }
    }


}
