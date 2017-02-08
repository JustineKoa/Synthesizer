package com.example.koa53979.synthesizer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    private final int WHOLE_NOTE = 1000;
    ImageButton imageButton;
    ImageButton imageButton2;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpFS;
    private MediaPlayer mpG;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpCS;
    private MediaPlayer mpD;
    private MediaPlayer mpBB;
    private MediaPlayer mpC;
    private MediaPlayer mpDS;
    private MediaPlayer mpGS;
    private MediaPlayer mpHE;
    private MediaPlayer mpHF;
    private MediaPlayer mpHFS;
    private MediaPlayer mpHG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFS = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpCS = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpBB = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpDS = MediaPlayer.create(this, R.raw.scaleds);
        mpGS = MediaPlayer.create(this, R.raw.scalegs);
        mpHE = MediaPlayer.create(this, R.raw.scalehighe);
        mpHF = MediaPlayer.create(this, R.raw.scalehighf);
        mpHFS = MediaPlayer.create(this, R.raw.scalehighfs);
        mpHG = MediaPlayer.create(this, R.raw.scalehighg);

        addListenerOnButton();
        addListenerOnButton2();
    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity", "Audio playback interrupted");
        }
    }

    public void playNote(String s) {
        if (s.equals("A")) {
            mpA.seekTo(0);
            mpA.start();
        } else if (s.equals("B")) {
            mpB.seekTo(0);
            mpB.start();
        } else if (s.equals("BB")) {
            mpBB.seekTo(0);
            mpBB.start();
        } else if (s.equals("C")) {
            mpC.seekTo(0);
            mpC.start();
        } else if (s.equals("CS")) {
            mpCS.seekTo(0);
            mpCS.start();
        } else if (s.equals("D")) {
            mpD.seekTo(0);
            mpD.start();
        } else if (s.equals("DS")) {
            mpDS.seekTo(0);
            mpDS.start();
        } else if (s.equals("E")) {
            mpE.seekTo(0);
            mpE.start();
        } else if (s.equals("F")) {
            mpF.seekTo(0);
            mpF.start();
        } else if (s.equals("FS")) {
            mpFS.seekTo(0);
            mpFS.start();
        } else if (s.equals("G")) {
            mpG.seekTo(0);
            mpG.start();
        } else if (s.equals("GS")) {
            mpGS.seekTo(0);
            mpGS.start();
        } else if (s.equals("HE")) {
            mpHE.seekTo(0);
            mpHE.start();
        } else if (s.equals("HF")) {
            mpHF.seekTo(0);
            mpHF.start();
        } else if (s.equals("HFS")) {
            mpHFS.seekTo(0);
            mpHFS.start();
        } else if (s.equals("HG")) {
            mpHG.seekTo(0);
            mpHG.start();
        }
    }

    public void back(View v) {
        Button button =(Button) v;
        startActivity(new Intent(getApplicationContext(), SynthesizerActivity.class));
    }

    public void addListenerOnButton(){
        imageButton = (ImageButton) findViewById(R.id.imageButton1);

        imageButton.setOnClickListener(new OnClickListener(){
            public void onClick(View arg0){
                String line1[] = {"A","G","F","G"};
                String line2[] = {"A","A","A","Blank","G","G","G","Blank","A","C","C"};
                String line3[] = {"A","A","A","Blank","A","G","G","A","G","F"};
                try{
                    for(String note: line1) {
                        playNote(note);
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    delayPlaying(WHOLE_NOTE / 2);
                    for (String note : line2) {
                        playNote(note);
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    delayPlaying(WHOLE_NOTE / 2);
                    for(String note: line1) {
                        playNote(note);
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    for(String note: line3) {
                        playNote(note);
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    delayPlaying(WHOLE_NOTE / 2);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                Toast.makeText(Activity2.this, "Mary had a little lamb!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void addListenerOnButton2(){
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);

        imageButton2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                String line1[] = {"A", "A", "HE", "HE", "HFS", "HFS", "HE", "Blank", "D", "D", "CS", "CS", "B", "B", "A"};
                String line2[] = {"HE", "HE", "D", "D", "CS", "CS", "B"};
                int repeats = 2;
                try {
                    for (String note : line1) {
                        playNote(note);
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    delayPlaying(WHOLE_NOTE / 2);
                    for (int i = 1; i <= repeats; i++) {
                        for (String note : line2) {
                            playNote(note);
                            delayPlaying(WHOLE_NOTE / 2);
                        }
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    for (String note : line1) {
                        playNote(note);
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                    delayPlaying(WHOLE_NOTE / 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Toast.makeText(Activity2.this, "Twinkle Twinkle Little Star!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
