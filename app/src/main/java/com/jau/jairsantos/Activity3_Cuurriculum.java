package com.jau.jairsantos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.File;

public class Activity3_Cuurriculum extends AppCompatActivity {
WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3__cuurriculum);
        //web_curricu = (WebView)findViewById(R.id.web_curriculum);

       // String pdf ="https://drive.google.com/file/d/1IQBmNI3V7mN5M6lpZn6ZXxCq70k5srzn/view?usp=sharing.pdf";
        //web_curricu.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=" + pdf);
        //web_curricu.getSettings().setJavaScriptEnabled(true);//habilitando o javascript
       // web_curricu.setWebViewClient(new WebViewClient());

        //WebView wv=new WebView(Activity3_Cuurriculum.this);
       // webView.getSettings().setJavaScriptEnabled(true);
        wv = (WebView) findViewById(R.id.web_curriculum);

        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(true);
        ws.setAllowFileAccess(true);

        wv.loadUrl("https://drive.google.com/file/d/1Mnp-mfgY9mhBsnhdYPWMOIvRvxQwiDPW/view?usp=sharing.pdf"+"https://drive.google.com/viewerng/viewer?embedded=true&url=");

        wv.setWebViewClient(new WebViewClient());
        }
    }

