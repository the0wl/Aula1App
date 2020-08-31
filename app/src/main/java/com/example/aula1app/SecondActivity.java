package com.example.aula1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText etNome;
    String TAG = "SECOND_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etNome = (EditText) findViewById(R.id.etDegree);
        Button btNext = (Button) findViewById(R.id.btNext);

        Log.i(TAG, "Realizou o OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "Realizou o OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "Realizou o OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "Realizou o OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG, "Realizou o OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "Realizou o OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(TAG, "Realizou o OnRestart");
    }

    public void trocaTela(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("DEGREE", Float.parseFloat(etNome.getText().toString()));
        startActivity(intent);
    }


}