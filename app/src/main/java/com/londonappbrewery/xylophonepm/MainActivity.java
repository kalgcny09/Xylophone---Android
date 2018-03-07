package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);


        // TODO: Load and get the IDs to identify the sounds


    }

    // TODO: Add the play methods triggered by the buttons
    public void playC(View v) {
        Log.d("Xylophone", "Red Button Clicked");
    }

    public void playD(View v) {
        Log.d("Xylophone", "Orange Button Clicked");
    }

    public void playE(View v) {
        Log.d("Xylophone", "Yellow Button Clicked");
    }

    public void playF(View v) {
        Log.d("Xylophone", "Green Button Clicked");
    }

    public void playG(View v) {
        Log.d("Xylophone", "Teal Button Clicked");
    }

    public void playA(View v) {
        Log.d("Xylophone", "Blue Button Clicked");
    }

    public void playB(View v) {
        Log.d("Xylophone", "Purple Button Clicked");
    }




}
