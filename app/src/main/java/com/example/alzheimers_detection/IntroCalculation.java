

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

public class IntroCalculation extends AppCompatActivity {
Button nextfromcalculation;
ImageView calculationview;
String urlcalculationview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_calculation);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        calculationview=findViewById(R.id.calculationview);
        urlcalculationview="https://firebasestorage.googleapis.com/v0/b/alzheimers-detection.appspot.com/o/stage4.gif?alt=media&token=43156ab1-a515-4dab-9c18-b2f3d8e73f14";
        Picasso.with(this).load(urlcalculationview).into(calculationview);
        nextfromcalculation=findViewById(R.id.nextfromcalculation);
        nextfromcalculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Calculation.class);
                startActivity(i);
            }
        });
    }
}