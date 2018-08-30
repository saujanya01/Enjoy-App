package com.example.saujanya.project;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class four extends AppCompatActivity
{
    TextView t1;
    Button b1,b2,b3;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        t1=(TextView)findViewById(R.id.textView);
        b1=(Button)findViewById(R.id.button28);
        b2=(Button)findViewById(R.id.button29);
        b3=(Button)findViewById(R.id.button30);
        mp=MediaPlayer.create(this,R.raw.music1);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                mp.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                mp.pause();
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                mp.pause();
                Intent i=new Intent(four.this,three.class);
                startActivity(i);;
                finish();
            }
        });
    }
}
