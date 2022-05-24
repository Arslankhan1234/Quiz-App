package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView t;
Button btn,bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button2);
        t=findViewById(R.id.textView2);
        bt1=findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int min = 65;
                int max = 91;
                int r = (int)Math.floor(Math.random()*(max-min+1)+min);

                if(r==65)
               {
                   Intent intent=new Intent(MainActivity.this,A.class);
                   startActivity(intent);

               }
              else
                {
                    Intent  intent=new Intent(MainActivity.this,B.class);
                    startActivity(intent);

                }



            }
        });

    }


}