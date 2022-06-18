package com.example.whatsappui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

public class HelpCenterActivity extends AppCompatActivity {
    Toolbar backbtnTlb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_center);

        backbtnTlb = findViewById(R.id.backbtnTlb);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.closeButton:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}