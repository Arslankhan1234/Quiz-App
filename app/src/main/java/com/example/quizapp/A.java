package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class A extends AppCompatActivity {
    TextView t;
   Button a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        t = (TextView) findViewById(R.id.textView);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
    }

    public void answer(View view) {
        if(view.getId()==R.id.a)
        {
            t.setText("false");
    }

        if(view.getId()==R.id.b)
        {
            t.setText("True");
        }

}
}