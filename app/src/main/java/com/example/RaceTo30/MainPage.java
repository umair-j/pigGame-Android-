package com.example.RaceTo30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainPage extends AppCompatActivity {

    String noOfPlayers;
    boolean buttonPressed = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

    }

    public void goTo30(View view) {
        if(buttonPressed==false){
            noOfPlayers="2";
        }
        Intent i = new Intent(this, MainActivity.class);
        Bundle extras = new Bundle();
        extras.putString("limit","30");
        extras.putString("players",noOfPlayers);
        i.putExtras(extras);
        startActivity(i);

    }
    public void goTo50(View view) {
        if(buttonPressed==false){
            noOfPlayers="2";
        }
        Intent i = new Intent(this, MainActivity.class);
        Bundle extras = new Bundle();
        extras.putString("limit","50");
        extras.putString("players",noOfPlayers);
        i.putExtras(extras);
        startActivity(i);

    }
    public void goTo100(View view) {
        if(buttonPressed==false){
            noOfPlayers="2";
        }
        Intent i = new Intent(this, MainActivity.class);
        Bundle extras = new Bundle();
        extras.putString("limit","100");
        extras.putString("players",noOfPlayers);
        i.putExtras(extras);
        startActivity(i);
    }
    public void p1mode(View view){
        noOfPlayers = "1";
        buttonPressed = true;
    }
    public void p2mode(View view){
        noOfPlayers = "2";
        buttonPressed = true;
    }
}