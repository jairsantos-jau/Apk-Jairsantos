package com.jau.jairsantos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import static java.net.Proxy.Type.HTTP;

public class Activity2 extends AppCompatActivity {
ImageView img_github;
ImageView img_projetos;
ImageView img_certificado;
ImageView img_linkdin;
ImageView img_curriculu;
ImageView img_email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);



        img_github = (ImageView)findViewById(R.id.imageView9);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_left);
        img_github.startAnimation(animation);
        img_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pag_github = new Intent(Activity2.this,Activity3_github.class);
                startActivity(pag_github);
            }
        });


        img_projetos = (ImageView)findViewById(R.id.imageView8);
        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_right);
        img_projetos.startAnimation(animation2);
        img_projetos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pag_projetos = new Intent(Activity2.this,Projetos.class);
                startActivity(pag_projetos);
            }
        });

        img_curriculu = (ImageView)findViewById(R.id.img_curriculu);
        Animation animation5 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_right);
        img_curriculu.startAnimation(animation5);






        //trabalhando com imagem objeto linkdin
        img_linkdin = (ImageView)findViewById(R.id.img_linkdin);
        Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_left);
        animation3.setDuration(2500);
        img_linkdin.startAnimation(animation3);

        img_linkdin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pag_linkdin = new Intent(Activity2.this,Activity3_linkdin.class);
                startActivity(pag_linkdin);
            }
        });

        img_certificado = (ImageView)findViewById(R.id.img_certificados);
        Animation animation4 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_left);
        animation4.setDuration(2500);
        img_certificado.startAnimation(animation3);
        img_certificado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pag_certificado = new Intent(Activity2.this,Certificados.class);
                startActivity(pag_certificado);
            }
        });


        img_curriculu = (ImageView)findViewById(R.id.img_curriculu);
        img_curriculu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pag_curriculu = new Intent(Activity2.this,Activity3_Cuurriculum.class);
                startActivity(pag_curriculu);
            }
        });
        ///email enviar e anexa arquivo

        img_email = (ImageView)findViewById(R.id.id_img_email);
        Animation animation6 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_right);
        img_email.startAnimation(animation6);

        img_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject of email");
                intent.putExtra(Intent.EXTRA_TEXT, "Assunto:");
                intent.setData(Uri.parse("mailto:jairsantos-jau@hotmail.com"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });



    }
}