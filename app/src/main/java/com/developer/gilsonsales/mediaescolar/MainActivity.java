package com.developer.gilsonsales.mediaescolar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    ImageView imagem;
    TextView texto;
    Animation show;
    Animation vanish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagem = findViewById(R.id.seta);
        texto = findViewById(R.id.info);
        imagem.setVisibility(View.INVISIBLE);

        show = new AlphaAnimation(0,1);
        vanish = new AlphaAnimation(1,0);

        show.setDuration(500);
        vanish.setDuration(500);

        show.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                imagem.setVisibility(View.VISIBLE);

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imagem.setVisibility(View.VISIBLE);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        vanish.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                imagem.setVisibility(View.VISIBLE);

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imagem.setVisibility(View.INVISIBLE);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }

    public void click(View view){
        if(Math.random()<0.5) {

            texto.setText("Siga para Esquerda");
            imagem.setScaleX(1f);
        }else {

            texto.setText("Siga para Direita");
            imagem.setScaleX(-1f);

        }
        imagem.startAnimation(show);
        //objeto timer para disparar a função sumir (vanish)
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
            imagem.startAnimation(vanish);
            }
        }, 2000);
    }
}
