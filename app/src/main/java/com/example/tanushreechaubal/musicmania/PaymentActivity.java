package com.example.tanushreechaubal.musicmania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by TanushreeChaubal on 2/10/18.
 */

public class PaymentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Button viewMainMenu = findViewById(R.id.viewPaymentScreen_Button);
        viewMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewMainScreenIntent = new Intent(PaymentActivity.this, StoreActivity.class);
                startActivity(viewMainScreenIntent);
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(PaymentActivity.this, StoreActivity.class));
        finish();
    }
}
