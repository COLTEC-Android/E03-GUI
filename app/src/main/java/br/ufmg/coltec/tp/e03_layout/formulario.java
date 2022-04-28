package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class formulario extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Button btnEnviarFormulario = findViewById(R.id.btn_enviarFormulario);

        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);

        alertBuilder.setTitle(R.string.msg_aviso);
        alertBuilder.setMessage(R.string.msg_texto_aviso);

        alertBuilder.setPositiveButton(R.string.msg_btn_enviar, (dialogInterface, i) -> {
                    Toast.makeText(getBaseContext(), R.string.msg_toast_enviado, Toast.LENGTH_LONG).show();
                }
        );

        alertBuilder.setNegativeButton(R.string.msg_btn_cancelar, (dialogInterface, i) -> {
                    Toast.makeText(getBaseContext(), R.string.msg_toast_cancelado, Toast.LENGTH_LONG).show();
                }
        );

        AlertDialog dialog = alertBuilder.create();

        btnEnviarFormulario.setOnClickListener((view) -> {
            dialog.show();
        });
    }

}