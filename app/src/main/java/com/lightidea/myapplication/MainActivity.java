package com.lightidea.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public TextView txtemail;
    public Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin=(Button)(findViewById(R.id.loginbtn)) ;
       // txtemail=(TextView)(findViewById(R.id.emailtxt));
        //Toast.makeText(this, "mothu", Toast.LENGTH_LONG).show();
       // Intent i=new Intent(MainActivity.this,logActivity.class);
        //startActivity(i);
       btnlogin.setOnClickListener(new View.OnClickListener() {

           @Override
            public void onClick(View v) {
               // txtemail.setText("Moe Thuzar");
               Intent i=new Intent(MainActivity.this,logActivity.class);


            }
        });


    }
}