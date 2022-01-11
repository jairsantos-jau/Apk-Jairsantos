package com.jau.jairsantos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Activity3_github extends AppCompatActivity {
WebView class_github;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3_github);

        class_github = (WebView)findViewById(R.id.web_github);
        class_github.loadUrl("https://github.com/jairsantos-jau/");
        class_github.getSettings().setJavaScriptEnabled(true);//habilitando o javascript
        class_github.setWebViewClient(new WebViewClient());
    }
}