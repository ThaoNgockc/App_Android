package com.example.app_android.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database_App extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Thông tin";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_TAI_KHOAN = "taikhoan";
    private static final String ID_TAI_KHOAN = "id";
    private static final String MAT_KHAU = "matkhau";

    private static final String EMAIL = "email";

    private static final String CREATE_TABLE_ACCOUNTS = "CREATE TABLE " + TABLE_TAI_KHOAN +
            "(" + ID_TAI_KHOAN + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            TABLE_TAI_KHOAN + " TEXT, " +
            MAT_KHAU + " TEXT)";





    public Database_App(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
