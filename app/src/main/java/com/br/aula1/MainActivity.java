package com.br.aula1;

import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Criação de objetos
    private EditText campoEntrada;
    private Button btAlterar, btNovaJanela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Atribuindo a cada objeto, o componente correspondente que está na tela
        //Convertendo o que está na tela (XML) com o ID "campoEntrada" para EditText
        campoEntrada = (EditText) findViewById(R.id.campoEntrada);

        //A mesma coisa para o botão. Buscando o ID "btnAlterar" do XML e
        //convertendo para Button
        btAlterar = (Button) findViewById(R.id.btAlterar);

        //Vincular objeto com componente da tela
        btNovaJanela = (Button) findViewById((R.id.btNovaJanela));

        //Configurar a ação do botão quando este for acionado
        btNovaJanela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor = campoEntrada.getText().toString();

                //Utilização da classe Intent para indicar qual recurso será aberto
                //Parâmetros: contexto, recurso a ser aberto
                Intent it = new Intent(MainActivity.this,NovaJanela.class);

                //Passagem de valores entre as telas
                it.putExtra("valorDigitado", valor); //chave, valor

                //Comando para abrir a nova tela
                startActivity(it);
            }
        });

        //Vincular o evento de clique no botão
        btAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Os códigos na sequência irão programar as ações que o botão
                //irá executar ao ser clicado
                String valor = campoEntrada.getText().toString();
                Toast.makeText(MainActivity.this,valor,Toast.LENGTH_LONG).show();
            }
        });
    }
}
