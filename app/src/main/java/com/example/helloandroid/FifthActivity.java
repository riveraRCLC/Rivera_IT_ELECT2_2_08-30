package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FifthActivity extends AppCompatActivity {

    private static final String TAG = "FifthActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        Log.v(TAG, "This is a verbose log.");
        Log.d(TAG,"This is a debug log.");
        Log.i(TAG, "This is an info log.");
        Log.w(TAG, "This is a warn log.");
        Log.e(TAG, "This is an error log.");

        Button button = (Button) findViewById(R.id.buttonNext);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.i(TAG, "Button Clicked");
                Intent intent = new Intent( FifthActivity.this, MainFragmentActivity.class);
                startActivity(intent);
            }
        });

    }
}