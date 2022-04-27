package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSplash = findViewById(R.id.btn_splash);
        Button btnNoticia = findViewById(R.id.btn_noticia);
        Button btnPrevisao = findViewById(R.id.btn_previsao);
        Button btnFormulario = findViewById(R.id.btn_formulario);

        btnSplash.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, splash.class);
            startActivity(intent);
        });

        btnNoticia.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, noticia.class);
            startActivity(intent);
        });

        btnPrevisao.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, PrevisaoDoTempo.class);
            startActivity(intent);
        });

        btnFormulario.setOnClickListener((view) -> {
            Intent intent = new Intent(MainActivity.this, formulario.class);
            startActivity(intent);
        });



    }


}
