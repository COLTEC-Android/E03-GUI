package com.example.e03_gui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    Button btnSend;

    EditText nome;
    EditText email;
    EditText coment;
    RatingBar ratingBar;

    private void startWidgets(){
        nome = findViewById(R.id.name);
        email = findViewById(R.id.email);
        coment = findViewById(R.id.coment);
        ratingBar = findViewById(R.id.ratingBar);
        btnSend = findViewById(R.id.confirmBtn);
    }

    private void showConfimDialog(){

        //Definição do Dialog
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(FormActivity.this);

        //Define parametros para o Dialog
        alertBuilder.setTitle("Seus dados estão corretos?");
        alertBuilder.setMessage(
                "Nome: " + nome.getText().toString() +
                "\nEmail: " + email.getText().toString() +
                "\nComentario: " + coment.getText().toString() +
                "\nNota: " + ratingBar.getRating()
        );
        
        alertBuilder.setPositiveButton("Estão!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getBaseContext(),"Dados enviados", Toast.LENGTH_SHORT).show();
            }
        });

        alertBuilder.setNegativeButton("Corrigir", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getBaseContext(),"Corrija os dados", Toast.LENGTH_SHORT).show();
            }
        });

        //Cria o dialogo e exibe na tela
        AlertDialog dialog = alertBuilder.create();
        dialog.show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);


        startWidgets();

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showConfimDialog();
            }
        });




    }
}