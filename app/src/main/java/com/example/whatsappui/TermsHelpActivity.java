package com.example.whatsappui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TermsHelpActivity extends AppCompatActivity {
    WebView termsW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_help);
        termsW = findViewById(R.id.termsW);

        termsW.loadUrl("https://faq.whatsapp.com/?locale=en_US");
        termsW.getSettings().setJavaScriptEnabled(true);
        termsW.setWebViewClient(new WebViewClient());


    }
}