package edu.coltec.ufmg.rafaalt.ex03_layouts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class FormularioAcvtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_acvtivity);

        //Criacao do Dialog
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setIcon(R.drawable.cuidado);
        alertDialog.setTitle(R.string.tituloAvisao);
        alertDialog.setMessage(R.string.msgAviso);
        alertDialog.setPositiveButton(R.string.txtBotao, ((dialogInterface, i) -> {
            Toast.makeText(FormularioAcvtivity.this, R.string.txtAcceptDialog, Toast.LENGTH_SHORT).show();
        }));
        alertDialog.setNegativeButton(R.string.txtBtnCancel, ((dialogInterface, i) -> {
            Toast.makeText(FormularioAcvtivity.this, R.string.txtCancelDialog, Toast.LENGTH_LONG).show();
        }));
        AlertDialog alert = alertDialog.create();

        Button btnEnviar = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener((view -> {
            alert.show();
        }));
    }
}