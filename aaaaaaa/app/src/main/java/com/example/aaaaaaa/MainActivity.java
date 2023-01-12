package com.example.botones;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends Activity {

    public ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gif();
    }


    public void Gif () {

        imagen = findViewById(R.id.mondongo);

        String url= "https://media.tenor.com/HSGed30rZIoAAAAd/mondongo-milkchoco.gif";

        Uri urlparse = Uri.parse(url);
        Glide.with(getApplicationContext()).load(urlparse).into(imagen);


    }

}