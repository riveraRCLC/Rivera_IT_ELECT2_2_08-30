package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainFragmentActivity extends AppCompatActivity {

    Button firstFragment, secondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);

        //get the reference of Button's
            firstFragment = (Button) findViewById(R.id.firstFragment);
            secondFragment = (Button) findViewById(R.id.secondFragment);

        // perform setOnClickListener event on First Button
            firstFragment.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
        // load First Fragment
                    loadFragment(new FragmentA());
                }
            });
        // perform setOnCLickListener event on Second Button
            secondFragment.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
        // load Second Fragment
                    loadFragment(new FragmentB());
                }
            });
    }
    private void loadFragment(Fragment fragment){
        // create a fragment manager
        FragmentManager fm= getFragmentManager();
        // create a fragment Transaction to begin the transaction and replace the fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        //replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }

}