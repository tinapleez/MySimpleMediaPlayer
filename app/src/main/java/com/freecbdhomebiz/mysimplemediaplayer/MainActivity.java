/*
 * Copyright (c) 2018 Tina Taylor
 */

package com.freecbdhomebiz.mysimplemediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button playButton = findViewById(R.id.button_play);
        Button pauseButton = findViewById(R.id.button_pause);
        Button stopButton = findViewById(R.id.button_stop);

        // Create MediaPlayer object and set looping true
        final MediaPlayer aida = MediaPlayer.create(this, R.raw.aidanikolaychuklullaby);
        aida.setLooping(true);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aida.start();
            }
        });

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aida.pause();
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aida.stop();
                aida.prepareAsync();
                aida.seekTo(0);
            }
        });

    }
}
