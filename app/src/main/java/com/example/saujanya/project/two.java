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

public class two extends AppCompatActivity
{
    Button b1,b2;
    EditText e1,e2,e3,e4,e5,e6;
    String s1,s2,s3,s4,s5,s6,s7;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button4);
        e1=(EditText)findViewById(R.id.editText3);
        e2=(EditText)findViewById(R.id.editText4);
        e3=(EditText)findViewById(R.id.editText5);
        e4=(EditText)findViewById(R.id.editText6);
        e5=(EditText)findViewById(R.id.editText7);
        e6=(EditText)findViewById(R.id.editText8);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i=new Intent(two.this,one.class);
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
                s3=e3.getText().toString();
                s4=e4.getText().toString();
                s5=e5.getText().toString();
                s6=e6.getText().toString();
                if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")||s5.equals("")||s6.equals(""))
                {
                    Toast.makeText(two.this, "Fill All Details", Toast.LENGTH_LONG).show();
                }
                else if(s2.compareTo(s3)!=0)
                {
                    Toast.makeText(two.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    SQLiteDatabase data=openOrCreateDatabase("user",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists row(name varchar, password varchar,email varchar)");
                    String s7="select * from row where name='"+s1+"' and password='"+s2+"'";
                    Cursor cursor=data.rawQuery(s7,null);
                    if (cursor.getCount()>0)
                    {
                        Toast.makeText(two.this, "User Already Exists", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        data.execSQL("insert into row values('"+s1+"','"+s2+"','"+s4+"')");
                        Toast.makeText(two.this, "Registration done", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}