package com.example.koa53979.synthesizer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class SynthesizerActivity extends AppCompatActivity {
    private final int WHOLE_NOTE = 1000;
    private static final String TAG = SynthesizerActivity.class.getName();
    private EditText c2Box;
    private EditText c9Box;
    private EditText c10Box;
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
    private Spinner spinnerC2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        c2Box = (EditText) findViewById(R.id.c2Box);
        c9Box = (EditText) findViewById(R.id.c9Box);
        c10Box = (EditText) findViewById(R.id.c10Box);
        spinnerC2 = (Spinner) findViewById(R.id.spinnerC2);

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

    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity", "Audio playback interrupted");
        }
    }

    public void onButton1Click(View v) {
        mpE.seekTo(0);
        Log.i(TAG, "Button 1 Clicked");
        mpE.start();
    }

    public void onButton2Click(View V) {
        mpF.seekTo(0);
        Log.i(TAG, "Button 2 Clicked");
        mpF.start();
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

    public void challenge1(View v) {
        Log.e("SynthesizerActivity", "Challenge 1 Button clicked");
        try {
            mpE.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpFS.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpG.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpA.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpB.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpCS.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpE.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void challenge2(View V) {
        Log.e("SynthesizerActivity", "Challenge 2 Button clicked");
        try {
            String note = spinnerC2.getSelectedItem().toString();
            int num = Integer.valueOf(c2Box.getText().toString());
            for (int i = 0; i < num; i++) {
                playNote(note);
                delayPlaying(WHOLE_NOTE);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void challenge3(View V) {
        String c3[] = {"E", "FS", "G", "A", "B", "CS", "D", "E"};
        Log.e("SynthesizerActivity", "Challenge 3 Button clicked");
        try{
            for(String note: c3) {
                playNote(note);
                delayPlaying(WHOLE_NOTE/2);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void challenge5(View v) {
        Log.e("SynthesizerActivity", "Challenge 5 Button clicked");
        String c5[] = {"A","A","HE","HE","HFS","HFS","HE","Blank","D","D","CS","CS","B","B","A"};
        Log.e("SynthesizerActivity", "Challenge 5 Button clicked");
        try{
            for(String note: c5) {
                playNote(note);
                delayPlaying(WHOLE_NOTE / 2);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void next(View v) {
        Button button =(Button) v;
        startActivity(new Intent(getApplicationContext(), Activity2.class));
    }

    // Twinkle Twinkle Little Star
    public void challenge9(View v) {
        String line1[] = {"A","A","HE","HE","HFS","HFS","HE","Blank","D","D","CS","CS","B","B","A"};
        String line2[] = {"HE","HE","D","D","CS","CS","B"};
        int repeats = Integer.valueOf(c10Box.getText().toString());
        int num = Integer.valueOf(c9Box.getText().toString());
        Log.e("SynthesizerActivity", "Challenge 9 Button clicked");
        try{
            for(String note: line1) {
                playNote(note);
                delayPlaying(WHOLE_NOTE / num);
            }
            delayPlaying(WHOLE_NOTE / 2);
            for (int i = 1; i <= repeats; i ++) {
                for (String note : line2) {
                    playNote(note);
                    delayPlaying(WHOLE_NOTE / num);
                }
                delayPlaying(WHOLE_NOTE / 2);
            }
            for(String note: line1) {
                playNote(note);
                delayPlaying(WHOLE_NOTE / num);
            }
            delayPlaying(WHOLE_NOTE / 2);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    // Mary Had a Little Lamb
    public void challenge12(View v) {
        String line1[] = {"A","G","F","G"};
        String line2[] = {"A","A","A","Blank","G","G","G","Blank","A","C","C"};
        String line3[] = {"A","A","A","Blank","A","G","G","A","G","F"};
        Log.e("SynthesizerActivity", "Challenge 12 Button clicked");
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
    }


}

