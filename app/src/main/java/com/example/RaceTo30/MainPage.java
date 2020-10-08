package com.example.RaceTo30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainPage extends AppCompatActivity {

    String opt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        launch();
    }

    public void launch(){
        Bundle b = getIntent().getExtras();
        if(b==null){
            opt = "30";
        }
        else {
            Intent i = getIntent();
            String lim1 = i.getStringExtra("choice");
            opt = lim1;
        }

    }

    public void goToGame(View view){
        Intent i = new Intent(this,MainActivity.class);
        i.putExtra("limit", opt);
        startActivity(i);

    }
    public void goToModes(View view){
        Intent i = new Intent(this,GameModes.class);

        startActivity(i);
    }

}