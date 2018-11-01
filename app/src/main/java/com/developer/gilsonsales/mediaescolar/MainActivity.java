package com.developer.gilsonsales.mediaescolar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imagem;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagem = findViewById(R.id.seta);
        texto = findViewById(R.id.texto);
        texto.setText("Toque aqui para continuar");
        imagem.setScaleX(-1f);

    }
}
