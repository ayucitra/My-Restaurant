package com.example.user.myrestaurant;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* setelah 4000s , buka activity ListActivity */
        setTimer(4000,ListActivity.class);
    }



    /* method set timer splash screen */
    public void setTimer(int delay, final Class intent){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),intent));
                finish();
            }
        }, delay);
    }



}
