

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

public class IntroAttention extends AppCompatActivity {
Button nextfromattention;
ImageView attentionview;
String urlattentionview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_attention);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        attentionview=findViewById(R.id.attentionview);
        urlattentionview="https://firebasestorage.googleapis.com/v0/b/alzheimers-detection.appspot.com/o/stage7.gif?alt=media&token=62df8530-60c8-4583-b2e5-d881b66b7db5";
        Picasso.with(this).load(urlattentionview).into(attentionview);

        nextfromattention=findViewById(R.id.nextfromattention);
        nextfromattention.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Attention.class);
                startActivity(i);
            }
        });
    }
}