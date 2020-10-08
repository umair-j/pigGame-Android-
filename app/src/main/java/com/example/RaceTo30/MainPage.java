package com.example.RaceTo30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

    }

    public void goTo30(View view) {

        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("limit", "30");

        startActivity(i);

    }
    public void goTo50(View view) {

        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("limit", "50");

        startActivity(i);

    }
    public void goTo100(View view) {

        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("limit", "100");

        startActivity(i);

    }
}