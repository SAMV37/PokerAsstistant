package com.Sam.samvel.pokerasstistant;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        final ImageView iv = (ImageView) findViewById(R.id.yin_yang);
        final Animation an = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);

        iv.startAnimation(an);

        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation){
                //finish();
                startActivity(new Intent(getApplicationContext(), Start.class));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
    public void onBackPressed(){}

}
