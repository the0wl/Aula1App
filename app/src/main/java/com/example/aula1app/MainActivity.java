package com.example.aula1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvNome = (TextView) findViewById(R.id.tvNome);
        Button btVoltar = (Button) findViewById(R.id.btVoltar);

        Intent intent = getIntent();
        String name = intent.getStringExtra(SecondActivity.NAME);

        tvNome.setText("Olá " + name + ", seja bem-vindo!");
    }

    public void trocaTela(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}