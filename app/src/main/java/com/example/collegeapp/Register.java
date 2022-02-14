package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5;
    AppCompatButton b1,b2;
    String getName,getMbno,getMail,getPass,getCPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.mbno);
        ed3=(EditText) findViewById(R.id.mail);
        ed4=(EditText) findViewById(R.id.p1);
        ed5=(EditText) findViewById(R.id.CPass);
        b1=(AppCompatButton) findViewById(R.id.breg);
        b2=(AppCompatButton) findViewById(R.id.bckbt);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getMbno=ed2.getText().toString();
                getMail=ed3.getText().toString();
                getPass=ed4.getText().toString();
                getCPass=ed5.getText().toString();
                if (getPass.equals(getCPass))
                {
                    Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(),getMbno, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(),getMail,Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(),getPass,Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(),getCPass,Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Password and confirm password doesn't match", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}