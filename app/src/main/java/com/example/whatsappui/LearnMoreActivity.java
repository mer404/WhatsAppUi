package com.example.whatsappui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LearnMoreActivity extends AppCompatActivity {
    WebView learnMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_more);
        learnMore = findViewById(R.id.learnMore);


        learnMore.loadUrl("https://faq.whatsapp.com/381777293328336/?locale=en_US");
        learnMore.getSettings().setJavaScriptEnabled(true);
        learnMore.setWebViewClient(new WebViewClient());
    }
}