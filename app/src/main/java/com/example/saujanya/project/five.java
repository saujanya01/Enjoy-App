package com.example.saujanya.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.zip.DeflaterOutputStream;

public class five extends AppCompatActivity
{
    Button b1,b2,b3,b4,b5,b6,b7;
    TextView t1,t2;
    EditText e1,e2;
    String s1,s2,s3;
    Float f1,f2,f3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        b1=(Button)findViewById(R.id.button12);
        b2=(Button)findViewById(R.id.button13);
        b3=(Button)findViewById(R.id.button14);
        b4=(Button)findViewById(R.id.button15);
        b5=(Button)findViewById(R.id.button16);
        b6=(Button)findViewById(R.id.button17);
        t1=(TextView)findViewById(R.id.textView2);
        t2=(TextView)findViewById(R.id.textView3);
        e1=(EditText)findViewById(R.id.editText9);
        e2=(EditText)findViewById(R.id.editText10);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(five.this,three.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                f1=Float.parseFloat(s1);
                f2=Float.parseFloat(s2);
                f3=f1+f2;
                s3=Float.toString(f3);
                t1.setText(s3);

            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                f1=Float.parseFloat(s1);
                f2=Float.parseFloat(s2);
                f3=f1-f2;
                s3=Float.toString(f3);
                t1.setText(s3);

            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                f1=Float.parseFloat(s1);
                f2=Float.parseFloat(s2);
                f3=f1*f2;
                s3=Float.toString(f3);
                t1.setText(s3);

            }
        });
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                f1=Float.parseFloat(s1);
                f2=Float.parseFloat(s2);
                if(f2==0)
                {
                    Toast.makeText(five.this, "Second number cannot be 0", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    f3=f1/f2;
                    s3=Float.toString(f3);
                    t1.setText(s3);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                t1.setText("");
            }
        });
    }
}