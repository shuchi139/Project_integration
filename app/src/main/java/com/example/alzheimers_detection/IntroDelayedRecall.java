

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

public class IntroDelayedRecall extends AppCompatActivity {
Button nextfromdelayedrecall;
ImageView unclegif,caterpillargif;
String urluncle,urlcaterpillar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_delayed_recall);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        unclegif=findViewById(R.id.unclegif);
        caterpillargif=findViewById(R.id.caterpillargif);

        urlcaterpillar="https://firebasestorage.googleapis.com/v0/b/alzheimers-detection.appspot.com/o/caterpillar_min.png?alt=media&token=89ea34fa-322f-404f-b4c0-e402621ae643";
        urluncle="https://firebasestorage.googleapis.com/v0/b/alzheimers-detection.appspot.com/o/uncle.gif?alt=media&token=d71b0ea5-619a-4159-8efc-89b0bfd16ab1";

        Picasso.with(this).load(urlcaterpillar).into(caterpillargif);
        Picasso.with(this).load(urluncle).into(unclegif);

        nextfromdelayedrecall=findViewById(R.id.nextfromdelayedrecall);

        nextfromdelayedrecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DelayedRecall.class);
                startActivity(i);
            }
        });
    }
}