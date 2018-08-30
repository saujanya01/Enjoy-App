package com.example.saujanya.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class thirteen extends AppCompatActivity
{
    Button b1;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteen);
        b1=(Button)findViewById(R.id.button27);
        t1=(TextView)findViewById(R.id.textView12);
        t2=(TextView)findViewById(R.id.textView13);
        t2.setText(""+nine.score+"");
        nine.score=0;
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(thirteen.this, three.class);
                startActivity(i);
                finish();
            }
        });
    }
}