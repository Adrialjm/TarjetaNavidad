package com.example.nosecomova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Con esto me quito la barra fea de encima, nunca me ha gustado.
        getSupportActionBar().hide();
    }

    public boolean i;
    int n = 1;

    public void cambiarLetra(View view) {

        TextView izq = (TextView) findViewById(R.id.pepito);
        if (i == true) {
            izq.setText("¿Goodbye World?");
            i = false;
            n++;
        } else {
            izq.setText("¡Hello World!");
            i = true;
            n++;
        }
        ambosBotones(n, n2);
    }

    public boolean i2;
    int n2 = 1;

    public void aparecerLetra(View view) {
        TextView dr = (TextView) findViewById(R.id.juan);

        if (i2 == true) {
            dr.setText("UF " + n2);
            i2 = false;
            n2++;
        } else {
            dr.setText("UF " + n2);
            i2 = true;
            n2++;
        }
        ambosBotones(n, n2);
    }

    public void ambosBotones(int n, int n2) {

        TextView both = (TextView) findViewById(R.id.juan2);

        // Si está la UF impar y "Hello world" saldrá un huevo (Easter egg)

        if (n2 % 2 == 0 && n % 2 == 0) {

            both.setText("\uD83E\uDD5A");

        } else both.setText("");

    }







            /*Esto debería colorear los botones, pero por algún motivo
             No se me colorean ni haciendolo a mano, raro


            Button derecho = findViewById(R.id.button);
            derecho.setBackgroundColor(Color.parseColor("#f0f0f0"));

            Button izquierdo = findViewById(R.id.button2);
            izquierdo.setBackgroundColor(Color.parseColor("#f0f0f0")); */


}



