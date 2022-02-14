package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FacuiltySearch extends AppCompatActivity {
    EditText ed1;
    AppCompatButton b1,b2;
    String getFName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facuilty_search);
        ed1=(EditText) findViewById(R.id.fname);
        b1=(AppCompatButton) findViewById(R.id.sb);
        b2=(AppCompatButton) findViewById(R.id.bckd);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFName=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),getFName,Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashBoard.class);
                startActivity(i);
            }
        });
    }
}