package com.nkassociates.mytown;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    Context context;
    SQLiteDatabase db;
    private static MyDatabaseHelper mInstance = null;

    public static MyDatabaseHelper getInstance(Context ctx) {

        if (mInstance == null) {
            mInstance = new MyDatabaseHelper(ctx.getApplicationContext());
        }
        return mInstance;
    }

    MyDatabaseHelper(Context ctx) {
        super(ctx, "OurDatabase", null, 1);
        this.context = ctx;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table bookmark(title TEXT PRIMARY KEY, location TEXT)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS bookmark");
        onCreate(sqLiteDatabase);

    }

    public void addBookmark(String title,String image, String location) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("title", title);
       // values.put("image", image);
        values.put("location", location);
        long rid = db.insert("bookmark", null, values);
        if (rid < 0) {
            Toast.makeText(context, "Insert issue!Product might be bookmared!", Toast.LENGTH_SHORT).show();
        } else Toast.makeText(context, "Insert Successful", Toast.LENGTH_SHORT).show();
        db.close();


    }

    public ArrayList getAllbookmark() {
        db = this.getWritableDatabase();
        Cursor cursor = db.query("bookmark", null, null, null, null, null, null, null);
        ArrayList<String> bms = new ArrayList<>();
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            do {
                String title = cursor.getString(0);
                String image = cursor.getString(1);
                String location = cursor.getString(2);
                bms.add(title + "\n\n" + "Bookmarked at: " + image + "\nFrom "+ location+"\n");

            } while (cursor.moveToNext());
        } else bms.add("No Records");
        cursor.close();
        db.close();
        return bms;
    }

    public void delBookmark(String title) {
        db = this.getWritableDatabase();
        title = title.replace("\'", "\'\'");
        long rid = db.delete("bookmark", "title=\'" + title + "\'", null);
        if (rid == 0) {
            Toast.makeText(context, "delete issue", Toast.LENGTH_SHORT).show();
        } else Toast.makeText(context, "" + rid + " rows deleted", Toast.LENGTH_SHORT).show();
        db.close();
    }

}

