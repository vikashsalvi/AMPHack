package com.AmpHack.book_transit.Menu;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.AmpHack.book_transit.R;

public class ReceiptActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.support.v7.app.ActionBar ab=getSupportActionBar();
        if(ab!=null){
            ab.setTitle("Ticket Receipt");
        }

        setContentView(R.layout.activity_receipt);

        Log.d("ReceiptActivity","Ok u got to the receipt activity");
    }
}
