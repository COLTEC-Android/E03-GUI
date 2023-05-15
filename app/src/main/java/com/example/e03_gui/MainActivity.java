package com.example.e03_gui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSplash;
    Button btnNoticia;
    Button btnPrevisao;
    Button btnFormulario;

    private void startWidgets(){

        btnSplash = findViewById(R.id.splash);
        btnNoticia = findViewById(R.id.noticia);
        btnPrevisao = findViewById(R.id.previsao);
        btnFormulario = findViewById(R.id.formulario);

    }

    private void btnClicks(){
        btnSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SplashScreenActivity.class);

                startActivity(intent);
            }
        });

        btnNoticia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NoticiaActivity.class);

                startActivity(intent);
            }
        });


        btnPrevisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PrevActivity.class);

                startActivity(intent);
            }
        });

        btnFormulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FormActivity.class);

                startActivity(intent);
            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startWidgets();

        btnClicks();






    }
}