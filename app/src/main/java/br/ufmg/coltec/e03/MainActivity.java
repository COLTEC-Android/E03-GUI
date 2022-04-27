package br.ufmg.coltec.e03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_relative = this.findViewById(R.id.relative);
        Button btn_table = this.findViewById(R.id.table);
        Button btn_linear = this.findViewById(R.id.linear);

        btn_relative.setOnClickListener((view) -> {
                //Abrindo a segunda tela.
                Intent segundaTela = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(segundaTela);
        });

        btn_table.setOnClickListener((view) -> {
            //Abrindo a segunda tela.
            Intent terceiraTela = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(terceiraTela);
        });

        btn_linear.setOnClickListener((view) -> {
            //Abrindo a segunda tela.
            Intent quartaTela = new Intent(MainActivity.this, MainActivity4.class);
            startActivity(quartaTela);
        });
    }
}