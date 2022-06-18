package com.example.whatsappui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;

public class WebView extends AppCompatActivity {
    android.webkit.WebView helpWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        helpWebview = findViewById(R.id.webview);

        helpWebview.loadUrl("https://www.youtube.com/");
        helpWebview.getSettings().setJavaScriptEnabled(true);
        helpWebview.setWebViewClient(new WebViewClient());

    }
}