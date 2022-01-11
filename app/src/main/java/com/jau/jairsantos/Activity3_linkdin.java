package com.jau.jairsantos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class Activity3_linkdin extends AppCompatActivity {
WebView class_linkdin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3_linkdin);


        class_linkdin = (WebView)findViewById(R.id.web_linkdin);
        class_linkdin.loadUrl("https://www.linkedin.com/in/jair-santos-06413bb7/");
        class_linkdin.getSettings().setJavaScriptEnabled(true);//habilitando o javascript
        class_linkdin.setWebViewClient(new WebViewClient());

    }
}