

//added images to firebase storage
package com.example.alzheimers_detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class IntroExecutiveFunctioning extends AppCompatActivity {
Button nextfromexecutivefunctioning;
ImageView coinsgif,caves;
String urlcaves,urlcoinsgif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_executive_functioning);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        caves=findViewById(R.id.caves);
        coinsgif=findViewById(R.id.coinsgif);


        urlcaves="https://firebasestorage.googleapis.com/v0/b/alzheimers-detection.appspot.com/o/caves.jpg?alt=media&token=2eb73383-43d6-4231-b20e-cf5c21986284";
        urlcoinsgif="https://firebasestorage.googleapis.com/v0/b/alzheimers-detection.appspot.com/o/coingif.gif?alt=media&token=8ebc355e-51a3-4bbf-86e4-6645e69215a6";

        Picasso.with(this).load(urlcaves).into(caves);
        Picasso.with(this).load(urlcoinsgif).into(coinsgif);

        nextfromexecutivefunctioning=findViewById(R.id.nextfromexecutivefunctioning);

        nextfromexecutivefunctioning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),ExecutiveFunctioning.class);
                startActivity(i);
            }
        });

    }
}