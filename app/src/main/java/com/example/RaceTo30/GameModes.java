package com.example.RaceTo30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameModes extends AppCompatActivity {
    public String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_modes);
    }
    public void setVal30(View view){
        value = "30";
    }
    public void setVal50(View view){
        value = "50";
    }
    public void setVal100(View view){
        value = "100";
    }
    public void applyChange(View view){
        Intent i = new Intent(this,MainPage.class);
        i.putExtra("choice",value);
        startActivity(i);
    }
}