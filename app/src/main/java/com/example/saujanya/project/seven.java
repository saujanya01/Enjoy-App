package com.example.saujanya.project;

import android.app.TabActivity;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class seven extends AppCompatActivity
{
    Button b1,b2;
    EditText e1;
    TextToSpeech tt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
        b1=(Button)findViewById(R.id.button20);
        b2=(Button)findViewById(R.id.button21);
        e1=(EditText)findViewById(R.id.editText11);
        tt=new TextToSpeech(this, new TextToSpeech.OnInitListener()
        {
            @Override
            public void onInit(int i)
            {
                tt.setLanguage(Locale.ENGLISH);
                tt.setSpeechRate(0.7f);
            }
        });
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String s1;
                s1=e1.getText().toString();
                tt.speak(s1,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(seven.this,three.class);
                startActivity(i);;
                finish();
            }
        });
    }
}
