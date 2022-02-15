package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class DashBoard extends AppCompatActivity {
    AppCompatButton b1,b2,b3,b4,b5,b6;
    SharedPreferences myPrefer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        b1=(AppCompatButton) findViewById(R.id.student);
        b2=(AppCompatButton) findViewById(R.id.faculity);
        b3=(AppCompatButton) findViewById(R.id.searchs);
        b4=(AppCompatButton) findViewById(R.id.sf);
        b5=(AppCompatButton) findViewById(R.id.vb);
        b6=(AppCompatButton) findViewById(R.id.logout);
        myPrefer=getSharedPreferences("login",MODE_PRIVATE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),AddStudent.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),AddFacuilty.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),SearchStudent.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),FacuiltySearch.class);
                startActivity(i);
            }
        }));
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),ViewWebsite.class);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor edit=myPrefer.edit();
                edit.clear();
                edit.commit();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}