package com.uniftec.gestaofrotas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuTelaPrincipal extends AppCompatActivity {

    private Button TranspAtual, TranspFuturo, TranspRealizado, Sair;


    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        String code = intent.getExtras().getString("CODE");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tela_principal);
        Sair=(Button)findViewById(R.id.buttonSair);
        TranspAtual=(Button)findViewById(R.id.buttonTranspAtual);
        TranspFuturo=(Button)findViewById(R.id.buttonTranspFut);
        TranspRealizado=(Button)findViewById(R.id.buttonTranspRealizado);

        TranspAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TransporteAtual = new Intent(MenuTelaPrincipal.this, TransporteAtual.class);
                MenuTelaPrincipal.this.startActivity(TransporteAtual);

            }
        });



        Sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
               finishAffinity();
               System.exit(0);

            }
        });


    }

}