package com.uniftec.gestaofrotas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MenuLogin extends AppCompatActivity {
    private Button button;
    private EditText telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_login);
        button=(Button)findViewById(R.id.button);
        telefone=(EditText)findViewById(R.id.editTextPhone);

        button.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
               /*  String login_url = "http://10.0.2.2/getmotorista.php";
                String result ="";
                try {
                    String celular = telefone.getText().toString();
                    URL url = new URL(login_url);
                    HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                    String post_data = URLEncoder.encode("celular", "UTF-8")+"="+URLEncoder.encode(celular,"UTF-8");
                    bufferedWriter.write(post_data);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    outputStream.close();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));

                    String line ="";
                    while((line = bufferedReader.readLine())!=null){
                        result += line;
                    }
                    bufferedReader.close();
                    inputStream.close();
                    httpURLConnection.disconnect();
                    } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(!result.equals(null)){
                   Intent MenuPrincipal = new Intent(MenuLogin.this, MenuPrincipal.class);
                    MenuLogin.this.startActivity(MenuPrincipal);
                    MenuLogin.this.finish();
                    Toast toast = Toast.makeText(getApplicationContext(), "Entrou IF", Toast.LENGTH_LONG);
                    toast.show();

                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Entrou ELSE", Toast.LENGTH_LONG);
                    toast.show();

                }

            */
                    Login();

            }
        });

    }
    public void Login(){
        String celular = telefone.getText().toString();
        String type = "login";

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, celular);
    }
}