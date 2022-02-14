package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudent extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1,b2;
    String getName,getRollNum,getAdmin,getClg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.rolno);
        ed3=(EditText) findViewById(R.id.adno);
        ed4=(EditText) findViewById(R.id.clg);
        b1=(AppCompatButton) findViewById(R.id.sub);
        b2=(AppCompatButton) findViewById(R.id.bckd);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getRollNum=ed2.getText().toString();
                getAdmin=ed3.getText().toString();
                getClg=ed4.getText().toString();
                Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getRollNum,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getAdmin,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getClg,Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),DashBoard.class);
                startActivity(i);
            }
        });
    }
}