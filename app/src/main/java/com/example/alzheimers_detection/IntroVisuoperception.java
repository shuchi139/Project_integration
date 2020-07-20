

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

public class IntroVisuoperception extends AppCompatActivity {
Button nextfromvisuoperception;
ImageView visuoperceptionview;
String urlvisuoperception;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_visuoperception);


        visuoperceptionview=findViewById(R.id.visuoperceptionview);
        urlvisuoperception="https://firebasestorage.googleapis.com/v0/b/alzheimers-detection.appspot.com/o/stage8.gif?alt=media&token=65ce6aad-29ac-4037-b484-762e62c6b82a";
        Picasso.with(this).load(urlvisuoperception).into(visuoperceptionview);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        nextfromvisuoperception=findViewById(R.id.nextfromvisuoperception);
        nextfromvisuoperception.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Visuoperception.class);
                startActivity(i);
            }
        });
    }
}