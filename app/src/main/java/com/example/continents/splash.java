package com.example.continents;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;


public class splash extends AppCompatActivity {


    View viewProgress;
    AnimationSet animationSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        // getSupportActionBar().hide(); //hide the title bar
        //  this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        //      WindowManager.LayoutParams.FLAG_FULLSCREEN); //show the activity in full screen
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}




        setContentView(R.layout.activity_splash);

        viewProgress = findViewById(R.id.view_progress);
        int viewWidth = viewProgress.getWidth();

        TranslateAnimation move = new TranslateAnimation(-(getScreenWidth() / 2) + viewWidth / 2, (getScreenWidth() / 2) + viewWidth / 2 + viewWidth, 0, 0);
        move.setDuration(1000);
        TranslateAnimation move1 = new TranslateAnimation(-viewWidth, 0, 0, 0);
        move1.setDuration(500);
        ScaleAnimation laftOut = new ScaleAnimation(0, 1, 1, 1);
        laftOut.setDuration(500);

        animationSet = new AnimationSet(true);
        animationSet.addAnimation(move);
        animationSet.addAnimation(move1);
        animationSet.addAnimation(laftOut);
        animationSet.addAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.prog));

        startAnimation();

        new CountDownTimer(3000,100) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {

                final Dialog dialog = new Dialog(splash.this);
                View view = getLayoutInflater().inflate(R.layout.rotate_dialog, null);
                dialog.setContentView(view);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                view.findViewById(R.id.lineButt).startAnimation(animation);


                dialog.show();
                new CountDownTimer(2400, 100){
                    @Override
                    public void onTick(long millisUntilFinished) {}

                    @Override
                    public void onFinish() {
                        //  dialog.dismiss();
                        startActivity(new Intent(getApplicationContext(), Menu.class));
                    }
                }.start();


            }
        }.start();

    }

    private void startAnimation() {
        viewProgress.startAnimation(animationSet);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startAnimation();
            }
        }, 1000);
    }

    public static int getScreenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }



}