package com.example.aula1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String TAG = "MAIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvNome = (TextView) findViewById(R.id.tvNome);
        Button btVoltar = (Button) findViewById(R.id.btVoltar);

        Intent intent = getIntent();
        float degree = intent.getFloatExtra("DEGREE", 0);
        tvNome.setText(String.valueOf(CelsiusToFahreinheit(degree)) + "º F");

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

    public Float CelsiusToFahreinheit(float Celsius) {
        return ((Celsius * 9) / 5) + 32;
    }

    public void trocaTela(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }


}