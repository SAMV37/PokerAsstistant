package com.Sam.samvel.pokerasstistant;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Sit_place extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_sit_place);
    }
    public void onUTG(View v){
        startActivity(new Intent(getApplicationContext(), UTG_pocket_cards.class));
    }
    public void onMP(View v){
        startActivity(new Intent(getApplicationContext(), MP_pocket_cards.class));
    }
    public void onCO(View v){
        startActivity(new Intent(getApplicationContext(), CO_pocket_cards.class));
    }
    public void onBT(View v){
        startActivity(new Intent(getApplicationContext(), BT_pocket_cards.class));
    }
    public void onSB(View v){
        startActivity(new Intent(getApplicationContext(), SB_pocket_cards.class));
    }
    public void onBB(View v){
        startActivity(new Intent(getApplicationContext(), BB_pocket_cards.class));
    }
    public void onBackPressed(){
    }
}
