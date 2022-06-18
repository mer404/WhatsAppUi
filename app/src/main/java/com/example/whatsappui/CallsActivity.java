package com.example.whatsappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class CallsActivity extends AppCompatActivity {
    TextView chatstxt, statustxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calls);

        chatstxt = findViewById(R.id.chatstxt);
        statustxt = findViewById(R.id.statustxt);

        statustxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CallsActivity.this, StatusActivity.class);
                finish();
                startActivity(intent);
            }
        });


        chatstxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CallsActivity.this, MainActivity.class);
                finish();
                startActivity(intent);

            }
        });


    }
}