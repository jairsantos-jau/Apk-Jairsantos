package com.jau.jairsantos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Projetos extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Button btnfavelacao;
Button btnmeusite;
Spinner spnprojetos;

WebView web_favelacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projetos);
       // btnfavelacao =(Button)findViewById(R.id.btn_favelacao);
       //btnmeusite = (Button)findViewById(R.id.btn_meusite);
        spnprojetos =(Spinner)findViewById(R.id.id_spinner_projetos);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.projetos, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnprojetos.setAdapter(adapter);
        spnprojetos.setOnItemSelectedListener(this);


//botao chama site favelacao





        }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String projetosAD = parent.getItemAtPosition(position).toString();


switch (position){
    case 0 :navegarProjeto01();
    break;
    default:
        manuntencao();
}
    }

    private void manuntencao() {
        AlertDialog.Builder alert_manuntencao = new AlertDialog.Builder(this);
        alert_manuntencao.setTitle("Manuntenção!");
        alert_manuntencao.setMessage("Olá, Projetos sendo implementados!");
        alert_manuntencao.show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    private void navegarProjeto01(){
        web_favelacao = (WebView) findViewById(R.id.wv_favelacao);
        web_favelacao.loadUrl("http://favelacao.epizy.com");

        web_favelacao.getSettings().setJavaScriptEnabled(true);
        web_favelacao.setWebViewClient(new WebViewClient());
    }
    private void navegarProjeto02(){

    }
}
