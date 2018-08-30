package com.example.saujanya.project;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class one extends AppCompatActivity
{
    EditText e1,e2;
    Button b1,b2;
    String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                if (s1.equals("") || s2.equals(""))
                {
                    Toast.makeText(one.this, "Please fill all Details", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    SQLiteDatabase data=openOrCreateDatabase("user",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists row(name varchar, password varchar)");
                    String s4="select * from row where (name='"+s1+"' and password='"+s2+"')";
                    Cursor cursor=data.rawQuery(s4,null);
                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(one.this, "Login done!!! WAIT.", Toast.LENGTH_SHORT).show();
                        Intent j=new Intent(one.this,three.class);
                        startActivity(j);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(one.this, "No such user exists:(", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent j=new Intent(one.this, two.class);
                startActivity(j);
                finish();
            }
        });
    }
}