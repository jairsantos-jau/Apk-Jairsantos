package com.jau.jairsantos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class Certificados extends AppCompatActivity {
CardView card01;

ImageView img_ufs;
ImageView img_recodepro;
ImageView img_usp;
ImageView img_senai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificados);

        img_usp = (ImageView)findViewById(R.id.id_usp);
        WebView webview = new WebView(this);
        AlertDialog.Builder alert_manuntencao = new AlertDialog.Builder(this);

        //CERTIFICADO USP
        img_usp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alert_manuntencao.setTitle("Manuntenção!");
                alert_manuntencao.setMessage("Olá, O Cerytificado esta sendo Adicionado!");
                alert_manuntencao.show();

            }
        });


        ///outro ultimo
        img_ufs = (ImageView)findViewById(R.id.id_img_ufs);
        WebView webview_ufs = new WebView(this);
        img_ufs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(webview_ufs);
                webview_ufs.getSettings().setJavaScriptEnabled(true);
                webview_ufs.loadUrl("https://drive.google.com/file/d/193JawL_BvoPQ2M0lff1ZfpMN33tb7NbY/view?usp=sharing.pdf"+"https://drive.google.com/viewerng/viewer?embedded=true&url=");



            }
        });

        //recodepro certificado
        img_recodepro = (ImageView)findViewById(R.id.recodepro);
        WebView webview_recode = new WebView(this);
        img_recodepro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(webview_recode);
                webview_recode.getSettings().setJavaScriptEnabled(true);
                webview_recode.loadUrl("https://drive.google.com/file/d/193JawL_BvoPQ2M0lff1ZfpMN33tb7NbY/view?usp=sharing.pdf"+"https://drive.google.com/viewerng/viewer?embedded=true&url=");



            }
        });


    }
}
