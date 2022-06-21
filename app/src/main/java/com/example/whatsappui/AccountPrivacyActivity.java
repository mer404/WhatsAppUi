package com.example.whatsappui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AccountPrivacyActivity extends AppCompatActivity {
    TextView backAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_privacy);
        backAccount = findViewById(R.id.backAccount);
        backAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountPrivacyActivity.this, AccountActivity.class);
                startActivity(intent);

            }
        });
    }
}