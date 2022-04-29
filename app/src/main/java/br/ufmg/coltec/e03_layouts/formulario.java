package br.ufmg.coltec.e03_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Intent intent= new Intent(formulario.this, MainActivity.class);

        AlertDialog.Builder alertBilder= new AlertDialog.Builder(this);
        //alertBilder.setIcon(R.drawable.ic_launcher_foreground);
        alertBilder.setTitle("Salvar comentário:");
        alertBilder.setMessage("Podemos salvar?");

        alertBilder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(),"Comentário enviado.", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

        alertBilder.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(),"Comentário cancelado.", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

        Button btnFormulario=findViewById(R.id.comentar);
        btnFormulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog dialog=alertBilder.create();
                dialog.show();
            }
        });
    }
}