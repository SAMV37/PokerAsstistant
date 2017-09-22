package com.Sam.samvel.pokerasstistant;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class Start extends Activity {

    private Button share;
    private Button rate;
    private Button start;
    private Button table;
    private Button tut;

    private TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_start);


        rate = (Button) findViewById(R.id.rate);
        share = (Button) findViewById(R.id.share);
        start = (Button) findViewById(R.id.b_start);
        table = (Button) findViewById(R.id.b_table);
        tut = (Button) findViewById(R.id.b_tut);

        rate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("market//details?id=com.Sam.samvel.pokerasstistant&hl=en")));

                }catch(ActivityNotFoundException ae){
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=com.Sam.samvel.pokerasstistant&hl=en")));
                }
            }
        });
        share.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_SUBJECT, "SSS Poker Bot");
                String applink = "https://play.google.com/store/apps/details?id=com.Sam.samvel.pokerasstistant&hl=en";
                share.putExtra(Intent.EXTRA_TEXT, "Try new app: " + applink);
                startActivity(Intent.createChooser(share, "Share via"));
            }
        });

        //Screen size
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;

        //int b_start_margin =

        //Adding margins

//        RelativeLayout.LayoutParams start_params = (RelativeLayout.LayoutParams) start.getLayoutParams();
//        start_params.setMargins(0,b_start_margin,0,0);
//        start.setLayoutParams(start_params);


    }
    public void onStartClicked(View v){
        startActivity(new Intent(getApplicationContext(), Sit_place.class));
    }
    public void onBackPressed(){
    }
    public void onTut(View v){
        startActivity(new Intent(getApplicationContext(), Tut.class));
    }
    public void onTable(View v){
        startActivity(new Intent(getApplicationContext(), Table.class));
    }
}
