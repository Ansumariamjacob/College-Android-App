package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton b1,b2;
    String getEmail,getPass,preferValue;
    SharedPreferences myprefer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myprefer=getSharedPreferences("login",MODE_PRIVATE);
        ed1=(EditText) findViewById(R.id.email);
        ed2=(EditText) findViewById(R.id.pass);
        b1=(AppCompatButton) findViewById(R.id.lb);
        b2=(AppCompatButton) findViewById(R.id.regb);
        preferValue=myprefer.getString("email",null);//read
        if(preferValue!=null)
        {
            Intent i=new Intent(getApplicationContext(),DashBoard.class);
            startActivity(i);
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getEmail=ed1.getText().toString();
                getPass=ed2.getText().toString();
                Toast.makeText(getApplicationContext(),getEmail, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getPass,Toast.LENGTH_SHORT).show();
                if (getEmail.equals("admin@gmail.com")&&(getPass.equals("12345")))
                {
                    SharedPreferences.Editor myEdit=myprefer.edit();
                    myEdit.putString("email",getEmail);
                    myEdit.commit();
                    Intent i=new Intent(getApplicationContext(),DashBoard.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid ID", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Register.class);
                startActivity(i);
            }
        });
    }
}