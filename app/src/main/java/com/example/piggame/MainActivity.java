package com.example.piggame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int totalScore1 = 0;
    public int totalScore2 = 0;
    public int tempTotal1 = 0;
    public int tempTotal2 = 0;
    public static int user = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
        public void hold(View view){
            changeBack(view);
            if(user==0 && tempTotal1!=0){
                totalScore1+=tempTotal1;
                tempTotal1=0;
                user = 1;
            }
            else if(user==1&&tempTotal2!=0){
                totalScore2+=tempTotal2;
                tempTotal2=0;
                user=0;

            }
            TextView tt1 = (TextView)findViewById(R.id.totalScore);
            String StrTotal = Integer.toString(totalScore1);
            tt1.setText(StrTotal);
            TextView tt2 = (TextView)findViewById(R.id.total2);
            String StrTotal2 = Integer.toString(totalScore2);
            tt2.setText(StrTotal2);

            changeBack(view);

        }

        public void changeBack(View view){
            if(user==0) {
                RelativeLayout left = (RelativeLayout) findViewById(R.id.leftLayout);
                left.setBackgroundColor(Color.parseColor("#FF5E525A"));
                RelativeLayout right = (RelativeLayout) findViewById(R.id.rightLayout);
                right.setBackgroundColor(Color.parseColor("#93868F"));
            }
            else if(user==1){
                RelativeLayout right = (RelativeLayout) findViewById(R.id.rightLayout);
                right.setBackgroundColor(Color.parseColor("#FF5E525A"));
                RelativeLayout left = (RelativeLayout) findViewById(R.id.leftLayout);
                left.setBackgroundColor(Color.parseColor("#93868F"));
            }
    }

        public void rollDice(View view)
        {
            changeBack(view);
            TextView t = (TextView)findViewById(R.id.dieRoll);

            Random r = new Random();
            int num = r.nextInt(6) + 1;
            String n = Integer.toString(num);
            t.setText(n);
            if(num == 6 && user == 0){
               tempTotal1 = 0;
               user = 1;
            }
            else if(num != 6 && user == 0){
                tempTotal1+=num;
            }


            else if(num == 6 && user == 1){
                tempTotal2 = 0;
                user = 0;
            }
            else if(num != 6 && user == 1){
                tempTotal2+=num;
            }
            TextView tmp1 = (TextView)findViewById(R.id.tempScore);
            String tempStrTotal = Integer.toString(tempTotal1);
            tmp1.setText(tempStrTotal);

            TextView tmp2 = (TextView)findViewById(R.id.tempScore2);
            String tempStrTotal2 = Integer.toString(tempTotal2);
            tmp2.setText(tempStrTotal2);

            changeBack(view);
        }

    }


