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
        setContentView(R.layout.activity_receipt);

        Log.d("ReceiptActivity","Ok u got to the receipt activity");
    }
}
