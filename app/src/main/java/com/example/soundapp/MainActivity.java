package com.example.soundapp;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private Button playSoundButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mediaPlayer = MediaPlayer.create(this, R.raw.sound);


        playSoundButton = findViewById(R.id.playSoundButton);

        playSoundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!mediaPlayer.isPlaying()) {
                    mediaPlayer.start();
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();

        mediaPlayer.release();
        mediaPlayer = null;
    }
}
