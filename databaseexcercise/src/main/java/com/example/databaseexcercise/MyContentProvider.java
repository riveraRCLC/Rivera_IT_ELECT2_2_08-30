package com.example.databaseexcercise;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;

public class MyContentProvider extends ContentProvider {

    // Define contrasts for the content provider URI and database table
    public static final String AUTHORITY = "com.example.database";
    public static final Uri CONTEXT_URI = Uri.parse("content://" + AUTHORITY + "/my_table");

    // Define a database helper to manage the underlying SQLite database

    private MyDatabaseHelper dbHelper;

    // Implement the onCreate method to initialize the context provider



    @Override
    public boolean onCreate() {
        dbHelper = new MyDatabaseHelper(getContext());
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] projection,String selection,String[] selectionArgs,String sortOrder) {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.query("my_table",projection,selection,selectionArgs,String sortOrder){

        };
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }
}