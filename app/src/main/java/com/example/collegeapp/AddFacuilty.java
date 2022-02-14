package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddFacuilty extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5;
    AppCompatButton b1,b2;
    String getName,getDept,getQuali,getMbno,getmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_facuilty);
        ed1=(EditText) findViewById(R.id.fname);
        ed2=(EditText) findViewById(R.id.dname);
        ed3=(EditText) findViewById(R.id.qul);
        ed4=(EditText) findViewById(R.id.mbno);
        ed5=(EditText) findViewById(R.id.mail);
        b1=(AppCompatButton) findViewById(R.id.sub);
        b2=(AppCompatButton) findViewById(R.id.bckd);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getDept=ed2.getText().toString();
                getQuali=ed3.getText().toString();
                getMbno=ed4.getText().toString();
                getmail=ed5.getText().toString();
                Toast.makeText(getApplicationContext(),getName,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getDept,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getQuali,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getMbno,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getmail,Toast.LENGTH_SHORT).show();
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