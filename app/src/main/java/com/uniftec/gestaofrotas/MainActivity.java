package com.uniftec.gestaofrotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class MainActivity extends AppCompatActivity implements Runnable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler = new Handler();
        handler.postDelayed(this, 2000);
    }

    public void run(){
        Intent MenuLogin = new Intent(MainActivity.this, MenuLogin.class);
        MainActivity.this.startActivity(MenuLogin);
        MainActivity.this.finish();
    }

}