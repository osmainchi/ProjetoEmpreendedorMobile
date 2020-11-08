package com.uniftec.gestaofrotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity {

    private Button confirmar, sair;
    private EditText codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        String id = intent.getExtras().getString("ID");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        confirmar = (Button) findViewById(R.id.button);
        sair = (Button) findViewById(R.id.button2);
        codigo = (EditText) findViewById(R.id.editTextNumber);
        confirmar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Code(id);
            }
        });
        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                finishAffinity();
                System.exit(0);
            }
        });
    }
    public void Code(String ID) {
        String code = codigo.getText().toString();
        String type = "code";

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, ID, code);
    }
}