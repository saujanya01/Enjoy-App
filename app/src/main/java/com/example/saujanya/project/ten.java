package com.example.saujanya.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ten extends AppCompatActivity
{
    RadioButton r1,r2,r3,r4;
    Button b1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);
        t1=(TextView)findViewById(R.id.textView7);
        b1=(Button)findViewById(R.id.button23);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        r4=(RadioButton)findViewById(R.id.radioButton4);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(r2.isChecked())
                {
                    ++nine.score;
                }
                else
                {
                    --nine.score;
                }
                Intent i=new Intent(ten.this,eleven.class);
                startActivity(i);;
                finish();
            }
        });
    }
}
