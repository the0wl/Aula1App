package com.example.aula1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    public static final String NAME = "KELVIN";

    EditText etNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etNome = (EditText) findViewById(R.id.etNome);
        Button btNext = (Button) findViewById(R.id.btNext);

    }

    public void trocaTela(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(NAME, etNome.getText().toString());
        startActivity(intent);
    }


}