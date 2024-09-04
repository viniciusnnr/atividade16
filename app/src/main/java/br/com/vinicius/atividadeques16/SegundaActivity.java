package br.com.vinicius.atividadeques16;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends AppCompatActivity {

    private TextView nomeTextView, idadeTextView, alturaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        nomeTextView = findViewById(R.id.nomeTextView);
        idadeTextView = findViewById(R.id.idadeTextView);
        alturaTextView = findViewById(R.id.alturaTextView);

        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        int idade = intent.getIntExtra("idade", 0);
        float altura = intent.getFloatExtra("altura", 0.0f);

        nomeTextView.setText("Nome: " + nome);
        idadeTextView.setText("Idade: " + idade);
        alturaTextView.setText("Altura: " + altura + " metros");
    }
}