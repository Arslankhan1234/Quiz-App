package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

Button btn,bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button2);

        bt1=findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://github.com/Arslankhan1234");
                Intent intent = new
                        Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int min = 65;
                int max = 90;
                int r = (int)Math.floor(Math.random()*(max-min+1)+min);


                if(r==65)
                {
                    Intent intent=new Intent(MainActivity.this,A.class);
                    startActivity(intent);

                }

                if(r==66)
                {
                    Intent intent=new Intent(MainActivity.this,B.class);
                    startActivity(intent);

                }

                if(r==67)
                {
                    Intent intent=new Intent(MainActivity.this,C.class);
                    startActivity(intent);

                }

                if(r==68)
                {
                    Intent intent=new Intent(MainActivity.this,D.class);
                    startActivity(intent);

                }

                if(r==69)
                {
                    Intent intent=new Intent(MainActivity.this,E.class);
                    startActivity(intent);

                }

                if(r==70)
                {
                    Intent intent=new Intent(MainActivity.this,F.class);
                    startActivity(intent);

                }

                if(r==71)
                {
                    Intent intent=new Intent(MainActivity.this,G.class);
                    startActivity(intent);

                }

                if(r==72)
                {
                    Intent intent=new Intent(MainActivity.this,H.class);
                    startActivity(intent);

                }

                if(r==73)
                {
                    Intent intent=new Intent(MainActivity.this,I.class);
                    startActivity(intent);

                }

                if(r==74)
                {
                    Intent intent=new Intent(MainActivity.this,J.class);
                    startActivity(intent);

                }

                if(r==75)
                {
                    Intent intent=new Intent(MainActivity.this,K.class);
                    startActivity(intent);

                }

                if(r==76)
                {
                    Intent intent=new Intent(MainActivity.this,L.class);
                    startActivity(intent);

                }
                if(r==77)
                {
                    Intent intent=new Intent(MainActivity.this,M.class);
                    startActivity(intent);

                }

                if(r==78)
                {
                    Intent intent=new Intent(MainActivity.this,N.class);
                    startActivity(intent);

                }

                if(r==79)
                {
                    Intent intent=new Intent(MainActivity.this,O.class);
                    startActivity(intent);

                }

                if(r==80)
                {
                    Intent intent=new Intent(MainActivity.this,P.class);
                    startActivity(intent);

                }

                if(r==81)
                {
                    Intent intent=new Intent(MainActivity.this,Q.class);
                    startActivity(intent);

                }

                if(r==82)
                {
                    Intent intent=new Intent(MainActivity.this,Ss.class);
                    startActivity(intent);

                }
                if(r==83)
                {
                    Intent intent=new Intent(MainActivity.this,S.class);
                    startActivity(intent);

                }

                if(r==84)
                {
                    Intent intent=new Intent(MainActivity.this,T.class);
                    startActivity(intent);

                }

                if(r==85)
                {
                    Intent intent=new Intent(MainActivity.this,U.class);
                    startActivity(intent);

                }

                if(r==86)
                {
                    Intent intent=new Intent(MainActivity.this,V.class);
                    startActivity(intent);

                }

                if(r==87)
                {
                    Intent intent=new Intent(MainActivity.this,W.class);
                    startActivity(intent);

                }

                if(r==88)
                {
                    Intent intent=new Intent(MainActivity.this,X.class);
                    startActivity(intent);

                }
                if(r==89)
                {
                    Intent intent=new Intent(MainActivity.this,Y.class);
                    startActivity(intent);

                }

                if(r==90)
                {
                    Intent intent=new Intent(MainActivity.this,Z.class);
                    startActivity(intent);

                }
            }
        });

    }


}