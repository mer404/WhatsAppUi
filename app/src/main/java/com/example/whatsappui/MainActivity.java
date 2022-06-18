package com.example.whatsappui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    Toolbar tooBarMainpage;
    TextView statustxt, callstxt, androiddev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar(tooBarMainpage);
        tooBarMainpage = findViewById(R.id.tooBarMainpage);
        statustxt = findViewById(R.id.statustxt);
        callstxt = findViewById(R.id.callstxt);
        androiddev = findViewById(R.id.androiddev);


        tooBarMainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, tooBarMainpage);
                popupMenu.getMenuInflater().inflate(R.menu.home_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {


                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.search_menu:
                                Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.menuNewGroup:
                                Toast.makeText(MainActivity.this, "New Group", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.menuBroadcast:
                                Toast.makeText(MainActivity.this, "Broadcast", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.menuPayments:
                                Toast.makeText(MainActivity.this, "Payments", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.menuSettings:
                                setting();
                                break;
                            case R.id.menuStarredMessage:
                                Toast.makeText(MainActivity.this, "Starred Message", Toast.LENGTH_SHORT).show();
                                break;
                        }

                        return true;
                    }
                });
                popupMenu.show();
            }


        });

        callstxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CallsActivity.class);
                startActivity(intent);

            }
        });
        statustxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StatusActivity.class);
                startActivity(intent);
            }
        });

    }

    private void setting() {
        Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(intent);
    }


}
