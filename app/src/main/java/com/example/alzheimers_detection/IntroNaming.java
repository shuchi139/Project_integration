


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

public class IntroNaming extends AppCompatActivity {
Button nextfromnaming;
ImageView namingview;
String urlnamingview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_naming);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        namingview=findViewById(R.id.namingview);
        urlnamingview="https://firebasestorage.googleapis.com/v0/b/alzheimers-detection.appspot.com/o/stage2.gif?alt=media&token=af9f32f6-0a27-47bd-8911-2d4785297f95";
        Picasso.with(this).load(urlnamingview).into(namingview);

        nextfromnaming=findViewById(R.id.nextfromnaming);

        nextfromnaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), IntroAbstraction.class);
                startActivity(i);
            }
        });
    }
}