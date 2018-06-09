package com.example.tanushreechaubal.musicmania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by TanushreeChaubal on 2/10/18.
 */

public class StoreActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_store);

        Button setPayment = findViewById(R.id.setUpPayment_Button);
        setPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent setUpPaymentIntent = new Intent(StoreActivity.this, PaymentActivity.class);
                startActivity(setUpPaymentIntent);
            }
        });
    }
}
