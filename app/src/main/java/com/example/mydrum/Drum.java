package com.example.mydrum;

import android.media.AudioManager;
import android.media.SoundPool;

public class Drum {
    public SoundPool spool;
    public int code;
    public void Drum(){
        this.spool=new SoundPool(1, AudioManager.STREAM_MUSIC, 0);;
        this.code=0;
    }
    public int getCode(){
        return this.code;
    }
}
