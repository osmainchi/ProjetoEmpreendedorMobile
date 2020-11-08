package com.uniftec.gestaofrotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransporteAtual extends AppCompatActivity {

    private Button voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte_atual);
        voltar=(Button)findViewById(R.id.buttonVoltar);

        voltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent MenuTelaPrincipal = new Intent(TransporteAtual.this, MenuTelaPrincipal.class);
                TransporteAtual.this.startActivity(MenuTelaPrincipal);
                finish();
            }
        });
    }

}