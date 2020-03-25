package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.conversor.R.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        setTitle("Conversor");

    }


    public void cliquebotao(View view) {
        Log.d("texto", "clicou");
        EditText txt = findViewById(id.Valor);
        Editable valor = txt.getText();
        Log.d("texto", "valor: " + valor);
        float valorDigitado = 0;
        if (valor.length() > 0) {
             valorDigitado = Float.parseFloat(String.valueOf(valor));
        }
        Intent intent = new Intent(this, Tela2.class);
        intent.putExtra("resp", valorDigitado);
        startActivity(intent);
    }
}