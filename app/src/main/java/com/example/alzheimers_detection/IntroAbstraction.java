


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

public class IntroAbstraction extends AppCompatActivity {
Button nextfromabstraction;
ImageView abstractionview;
String urlabstractionview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_abstraction);

        abstractionview=findViewById(R.id.abstractionview);
        urlabstractionview="https://firebasestorage.googleapis.com/v0/b/alzheimers-detection.appspot.com/o/stage3.gif?alt=media&token=e4b58baf-c5c9-434a-b483-1667fa9d0555";
        Picasso.with(this).load(urlabstractionview).into(abstractionview);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        nextfromabstraction=findViewById(R.id.nextfromabstraction);
        nextfromabstraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Abstraction.class);
                startActivity(i);
            }
        });

    }
}