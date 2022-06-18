package com.example.whatsappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {
    TextView helpSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        helpSetting = findViewById(R.id.helpSetting);
        helpSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SettingsActivity.this, HelpCenterActivity.class);
                startActivity(intent);

            }
        });

    }
}