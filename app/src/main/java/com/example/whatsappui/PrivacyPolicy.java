package com.example.whatsappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PrivacyPolicy extends AppCompatActivity {
    WebView termspolicy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        termspolicy = findViewById(R.id.termspolicy);
        termspolicy.loadUrl("https://faq.whatsapp.com/?locale=en_US");
        termspolicy.getSettings().setJavaScriptEnabled(true);
        termspolicy.setWebViewClient(new WebViewClient());


    }


}