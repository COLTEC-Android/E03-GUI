package br.ufmg.coltec.e03;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button btn_enviar = this.findViewById(R.id.btn_enviar);

        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);

        alertBuilder.setIcon(R.drawable.ic_launcher_foreground);
        alertBuilder.setTitle("Aviso!");
        alertBuilder.setMessage("Deseja enviar seu comentario?.");

        alertBuilder.setPositiveButton("Enviar!", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), "Comentario enviado com sucesso!", Toast.LENGTH_LONG).show();
            }
        });

        alertBuilder.setNegativeButton("Cancelar!", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), "Envio do comentario cancelado!", Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog dialog = alertBuilder.create();

        btn_enviar.setOnClickListener((view) -> {
            dialog.show();
        });

    }
}