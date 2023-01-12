package com.example.tarjetanavidad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tarjeta3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarjeta3);
        findViewById(R.id.button2).setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), MainActivity.class);
            startActivity(intent);
        });
    }

}
