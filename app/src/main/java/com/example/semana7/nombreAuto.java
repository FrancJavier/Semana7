package com.example.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class nombreAuto extends AppCompatActivity {

    TextView Francisco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombre_auto);

        String Nombre = getIntent().getStringExtra("d");
        TextView pato = findViewById(R.id.Mensaje);
        pato.setText("Nombre foto es: " + Nombre);
    }


}