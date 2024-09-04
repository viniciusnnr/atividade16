package br.com.vinicius.atividadeques16;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nomeEditText, idadeEditText, alturaEditText;
    private Button enviarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEditText = findViewById(R.id.nomeEditText);
        idadeEditText = findViewById(R.id.idadeEditText);
        alturaEditText = findViewById(R.id.alturaEditText);
        enviarButton = findViewById(R.id.enviarButton);

        enviarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = nomeEditText.getText().toString();
                int idade = Integer.parseInt(idadeEditText.getText().toString());
                float altura = Float.parseFloat(alturaEditText.getText().toString());

                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);

                intent.putExtra("nome", nome);
                intent.putExtra("idade", idade);
                intent.putExtra("altura", altura);

                startActivity(intent);
            }
        });
    }
}