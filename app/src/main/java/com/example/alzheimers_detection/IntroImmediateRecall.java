

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

public class IntroImmediateRecall extends AppCompatActivity {
Button nextfromimmediaterecall;
ImageView immediaterecallview;
String urlimmediaterecallview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_immediate_recall);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        immediaterecallview=findViewById(R.id.immediaterecallview);
        urlimmediaterecallview="https://firebasestorage.googleapis.com/v0/b/alzheimers-detection.appspot.com/o/stage6.gif?alt=media&token=2342ac0a-7d1a-4a2f-842f-79ed3b9366f7";
        Picasso.with(this).load(urlimmediaterecallview).into(immediaterecallview);

        nextfromimmediaterecall=findViewById(R.id.nextfromimmediaterecall);
        nextfromimmediaterecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),ImmediateRecallVideo.class);
                startActivity(i);
            }
        });
    }
}