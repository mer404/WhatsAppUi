package com.example.whatsappui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TermsOfServiceActivity extends AppCompatActivity {
    WebView serviceterms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_of_service);
        serviceterms = findViewById(R.id.serviceterms);

        serviceterms.loadUrl("https://faq.whatsapp.com/?locale=en_US");
        serviceterms.getSettings().setJavaScriptEnabled(true);
        serviceterms.setWebViewClient(new WebViewClient());

    }
}