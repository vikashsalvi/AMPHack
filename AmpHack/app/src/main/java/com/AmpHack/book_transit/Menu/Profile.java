package com.AmpHack.book_transit.Menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.AmpHack.book_transit.R;
public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        android.support.v7.app.ActionBar ab=getSupportActionBar();
        if(ab!=null){
            ab.setTitle("Previous Bookings");
        }


        setContentView(R.layout.activity_profile);
    }
}

