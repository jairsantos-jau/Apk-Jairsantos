package com.jau.jairsantos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //splashScreen
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                telaActivity2();
            }
        },7000);


    }
    private void telaActivity2(){
        Intent intent = new Intent(MainActivity.this,Activity2.class);
        startActivity(intent);
        finish();

    }

}
