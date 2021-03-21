package com.example.mydrum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button btn_drum[]=new Button[9];
    int key[]=new int[9];
    SoundPool spool, spool2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        btn_drum[0]=(Button)findViewById(R.id.kick);
        btn_drum[1]=(Button)findViewById(R.id.snare);
        btn_drum[2]=(Button)findViewById(R.id.hat_open);
        btn_drum[3]=(Button)findViewById(R.id.hat_closed);
        btn_drum[4]=(Button)findViewById(R.id.crash_right);
        btn_drum[5]=(Button)findViewById(R.id.crash_left);
        btn_drum[6]=(Button)findViewById(R.id.tom_h);
        btn_drum[7]=(Button)findViewById(R.id.tom_m);
        btn_drum[8]=(Button)findViewById(R.id.tom_l);
        spool=new SoundPool(9, AudioManager.STREAM_MUSIC, 0);
        spool2=new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
 /*       spool[0] = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);
        spool[1] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        spool[2] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        spool[3] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        spool[4] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        spool[5] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        spool[6] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        spool[7] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        spool[8] = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);*/

        key[0]= spool.load(this, R.raw.kick,1);
        key[1]= spool.load(this, R.raw.snare ,1);
        key[2]= spool2.load(this, R.raw.hat_open,1);  // autoPause 사용 위함.
        key[3]= spool.load(this, R.raw.hat_closed,1);
        key[4]= spool.load(this, R.raw.crash_right,1);
        key[5]= spool.load(this, R.raw.crash_left,1);
        key[6]= spool.load(this, R.raw.tom_h,1);
        key[7]= spool.load(this, R.raw.tom_m,1);
        key[8]= spool.load(this, R.raw.tom_l,1);
        btn_drum[0].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)spool.play(key[0], 1, 1, 0, 0, 1);
                return false;
            }
        });
        btn_drum[1].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN)
                    spool.play(key[1], (float) 0.9, (float) 0.9, 0, 0, 1);
                return false;
            }
        });
        btn_drum[2].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN)
                    spool2.play(key[2], (float) 0.4, (float) 0.4, 0, 0, 1);
                return false;
            }
        });
        btn_drum[3].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    spool2.autoPause();
                    spool.play(key[3], 2, 2, 0, 0, 1);

                }
                return false;
            }
        });
        btn_drum[4].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                    spool.play(key[4], (float)0.8, (float)0.8, 0, 0, 1);
                return false;
            }
        });
        btn_drum[5].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                    spool.play(key[5], (float)0.8, (float)0.8, 0, 0, 1);
                return false;
            }
        });
        btn_drum[6].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                    spool.play(key[6], 1, 1, 0, 0, 1);
                return false;
            }
        });
        btn_drum[7].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                    spool.play(key[7], 1, 1, 0, 0, 1);
                return false;
            }
        });
        btn_drum[8].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                    spool.play(key[8], 1, 1, 0, 0, 1);
                return false;
            }
        });
    }
}
