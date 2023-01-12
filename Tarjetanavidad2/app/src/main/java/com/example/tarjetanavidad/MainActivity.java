package com.example.tarjetanavidad;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends Activity {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Random rand = new Random();

                int randomNum = rand.nextInt(3) + 1;

                if (randomNum == 1) {

                    Intent intent = new Intent(v.getContext(), Tarjeta1.class);
                    startActivity(intent);
                }

                if (randomNum == 2) {

                    Intent intent = new Intent(v.getContext(), Tarjeta2.class);
                    startActivity(intent);
                }

                if (randomNum == 3) {

                    Intent intent = new Intent(v.getContext(), Tarjeta3.class);
                    startActivity(intent);
                }
            }
        });
    }
}