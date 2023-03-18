package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Pizza extends AppCompatActivity {

    public static String[] pizzaMenu={
            "ALL MEAT PIZZA",
            "CALIFORNIA VEGGIE",
            "GARLIC CHICKEN"
    };
    public static String[] pizzaDetails={
            "Premium Crushed Tomato Sauce made of 100% California grown wine ",
            "Premium Crushed Tomato Sauce, fresh green peppers, fresh red onions,",
            "Creamy garlic Parmesan sauce, grilled chicken, apple good smoked bacon"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);


    }
}