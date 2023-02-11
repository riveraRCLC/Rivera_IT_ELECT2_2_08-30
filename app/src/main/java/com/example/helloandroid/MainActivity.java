package com.example.helloandroid;

import static android.service.controls.ControlsProviderService.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivty";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "This is verbose log");
        Log.d(TAG, "This is debug log");
        Log.i(TAG, "This is an info log");
        Log.w(TAG, "This is a warn log");
        Log.e(TAG, "This is an error log");

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onCLick(View v){
                Log.i(TAG,"Button CLicked");
            }
        });

    }
}