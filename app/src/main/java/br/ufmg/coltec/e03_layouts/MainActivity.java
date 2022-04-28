package br.ufmg.coltec.e03_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSplashSreen= findViewById(R.id.splash);
        Button btnNoticia= findViewById(R.id.noticia);
        Button btnClima=findViewById(R.id.tempo);
        Button btnFormulario=findViewById(R.id.avalia);

        btnSplashSreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, SplashScreen.class);
                startActivity(intent);
            }
        });

          btnNoticia.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent intent= new Intent(MainActivity.this, noticia.class);
                  startActivity(intent);
              }
          });

          btnClima.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent intent= new Intent(MainActivity.this, previsaoDoTempo.class);
                  startActivity(intent);
              }
          });

          btnFormulario.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent intent= new Intent(MainActivity.this, formulario.class);
                  startActivity(intent);
              }
          });

    }
}