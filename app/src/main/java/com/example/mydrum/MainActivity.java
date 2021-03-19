package com.example.mydrum;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button btn_drum[]=new Button[9];
    int key[]=new int[9];
    SoundPool spool[]=new SoundPool[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_drum[0]=(Button)findViewById(R.id.kick);
        btn_drum[1]=(Button)findViewById(R.id.snare);
        btn_drum[2]=(Button)findViewById(R.id.hat_open);
        btn_drum[3]=(Button)findViewById(R.id.hat_closed);
        btn_drum[4]=(Button)findViewById(R.id.crash_right);
        btn_drum[5]=(Button)findViewById(R.id.crash_left);
        btn_drum[6]=(Button)findViewById(R.id.tom_h);
        btn_drum[7]=(Button)findViewById(R.id.tom_m);
        btn_drum[8]=(Button)findViewById(R.id.tom_l);

        spool[0] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        spool[1] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        spool[2] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        spool[3] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        spool[4] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        spool[5] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        spool[6] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        spool[7] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        spool[8] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);

        key[0]= spool[0].load(this, R.raw.kick,1);
        key[1]= spool[1].load(this, R.raw.snare,1);
        key[2]= spool[2].load(this, R.raw.hat_open,1);
        key[3]= spool[3].load(this, R.raw.hat_closed,1);
        key[4]= spool[4].load(this, R.raw.crash_right,1);
        key[5]= spool[5].load(this, R.raw.crash_left,1);
        key[6]= spool[6].load(this, R.raw.tom_h,1);
        key[7]= spool[7].load(this, R.raw.tom_m,1);
        key[8]= spool[8].load(this, R.raw.tom_l,1);
        btn_drum[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spool[0].play(key[0], 1, 1, 0, 0, 1);
            }
        });
        btn_drum[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spool[1].play(key[1], (float)0.9, (float)0.9, 0, 0, 1);
            }
        });
        btn_drum[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spool[2].play(key[2], (float)0.4, (float)0.4, 0, 0, 1);
            }
        });
        btn_drum[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spool[2].autoPause();
                spool[3].play(key[3], 2, 2, 0, 0, 1);

            }
        });
        btn_drum[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spool[4].play(key[4], (float)0.8, (float)0.8, 0, 0, 1);
            }
        });
        btn_drum[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spool[5].play(key[5], (float)0.8, (float)0.8, 0, 0, 1);
            }
        });
        btn_drum[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spool[6].play(key[6], 1, 1, 0, 0, 1);
            }
        });
        btn_drum[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spool[7].play(key[7], 1, 1, 0, 0, 1);
            }
        });
        btn_drum[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spool[8].play(key[8], 1, 1, 0, 0, 1);
            }
        });

    }
}