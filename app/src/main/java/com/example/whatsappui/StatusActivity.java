package com.example.whatsappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StatusActivity extends AppCompatActivity {
    TextView chatstxt, calltxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        chatstxt = findViewById(R.id.chatstxt);
        calltxt = findViewById(R.id.callstxt);

        calltxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StatusActivity.this, CallsActivity.class);
                finish();
                startActivity(intent);

            }
        });

        chatstxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StatusActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}