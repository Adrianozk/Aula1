package com.br.aula1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NovaJanela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_janela);

        TextView campo = (TextView) findViewById(R.id.campoTexto);

        //Atribuindo o valor que veio da outra tela através de Intent
        String valorDigitado = getIntent().getStringExtra("valorDigitado");

        //Atribuindo o valor no campo TextView
        campo.setText(valorDigitado);
    }
}
