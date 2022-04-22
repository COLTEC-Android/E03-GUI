package edu.coltec.ufmg.rafaalt.ex03_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSplash = findViewById(R.id.btnSplash);
        Button btnPrevisao = findViewById(R.id.btnPrevisao);
        Button btnNoticia = findViewById(R.id.btnNoticia);
        Button btnForms = findViewById(R.id.btnFormulario);

        btnSplash.setOnClickListener((view -> {
            Intent intent = new Intent(MainActivity.this, SplashActivity.class);
            startActivity(intent);
        }));
        btnPrevisao.setOnClickListener((view -> {
            Intent intent = new Intent(MainActivity.this, PrevisaoActivity.class);
            startActivity(intent);
        }));
        btnNoticia.setOnClickListener((view -> {
            Intent intent = new Intent(MainActivity.this, NoticiaActivity.class);
            startActivity(intent);
        }));
        btnForms.setOnClickListener((view -> {
            Intent intent = new Intent(MainActivity.this, FormularioAcvtivity.class);
            startActivity(intent);
        }));
    }
}