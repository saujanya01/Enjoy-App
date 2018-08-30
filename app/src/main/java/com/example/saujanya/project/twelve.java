package com.example.saujanya.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class twelve extends AppCompatActivity
{
    RadioButton r1,r2,r3,r4;
    Button b1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve);
        t1=(TextView)findViewById(R.id.textView9);
        b1=(Button)findViewById(R.id.button26);
        r1=(RadioButton)findViewById(R.id.radioButton13);
        r2=(RadioButton)findViewById(R.id.radioButton14);
        r3=(RadioButton)findViewById(R.id.radioButton15);
        r4=(RadioButton)findViewById(R.id.radioButton16);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(r1.isChecked())
                {
                    ++nine.score;
                }
                else
                {
                    --nine.score;
                }
                Intent i=new Intent(twelve.this,thirteen.class);
                startActivity(i);
                finish();
            }
        });
    }
}
