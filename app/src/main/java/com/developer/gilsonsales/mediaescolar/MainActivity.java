package com.developer.gilsonsales.mediaescolar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        texto = findViewById(R.id.info);


    }

    public void click(View view){
        if(Math.random()<0.5) {

            texto.setText("Siga para Esquerda");
            imagem.setScaleX(1f);
        }else {

            texto.setText("Siga para Direita");
            imagem.setScaleX(-1f);

        }
    }
}
