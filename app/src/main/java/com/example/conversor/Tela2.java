package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        setTitle("Temperatura Convertida");

        Intent intent = getIntent();
        float valorRecebido = intent.getFloatExtra("resp",0);

        Log.d("texto","vaslor recebido: " + valorRecebido);

        float valorConversao = ((valorRecebido*9)/5) + 32;
        TextView txt = (TextView) findViewById(R.id.textView2);
        txt.setText("Valor convertido = " + valorConversao);
    }
}
