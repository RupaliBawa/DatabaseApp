package com.example.hp.databaseapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class db extends SQLiteOpenHelper {

    public db(Context context) {
        super(context, "database1", null, 12);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table table1 (username text, address text, phone text)") ;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean addData(String username, String address, String phone) {
       SQLiteDatabase s= getWritableDatabase();

        ContentValues cv=new ContentValues();
        cv.put("username",username);
        cv.put("address",address);
        cv.put("phone",phone);

        s.insert("table1",null, cv);

        return true;
    }

    public Cursor showData() {
       SQLiteDatabase s=getReadableDatabase();
       Cursor c=s.query("table1",null,null,null,null,null,null);
       return c;
    }

    public boolean updateData(String oldno, String newno) {

        String ar[]={oldno};
        SQLiteDatabase s=getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("phone",newno);
        s.update("table1",cv,"phone=?",ar);

        return true;
    }

    public boolean deleteData(String username) {

        SQLiteDatabase s=getWritableDatabase();
        String ar[]={username};
        s.delete("table1","username=?",ar);

        return true;
    }
}
