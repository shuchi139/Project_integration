package com.example.alzheimers_detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.VideoView;

public class ImmediateRecallVideo extends AppCompatActivity {
    VideoView vid;
    int seconds;
    Uri vidUri;
String path;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_immediate_recall_video);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        vid = (VideoView) findViewById(R.id.video_view);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.video_final;
        //path="https://firebasestorage.googleapis.com/v0/b/alzheimers-detection.appspot.com/o/video_final.mp4?alt=media&token=11374488-f55a-48ec-a56f-fa9f1c8842b1";
        vidUri = Uri.parse(path);

        seconds=1;
        final Handler handler2=new Handler();
        handler2.post(new Runnable() {
            @Override
            public void run() {
                if(seconds>0)
                {
                    seconds=seconds-1;
                    handler2.postDelayed(this,1000);
                }
                else
                {
                    vid.setVideoURI(vidUri);
                    vid.requestFocus();
                    vid.start();

                }
            }
        });


        vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
            @Override
            public void onCompletion(MediaPlayer mp){
                // invoke your activity here

                Intent i = new Intent(getApplicationContext(), ImmediateRecall.class);
                startActivity(i);

            }
        });    }
}