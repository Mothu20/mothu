package com.lightidea.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class FacebookSigninActivity extends AppCompatActivity {
    public Button btnsignin;
    public EditText texfirst;
    String moe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_signin);
        moe=getIntent().getStringExtra("Moe");
        Toast.makeText(this, moe, Toast.LENGTH_SHORT).show();
        btnsignin=(Button)findViewById(R.id.signinbtn);
        texfirst = (EditText) findViewById (R.id.firsttex);
        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent j = new Intent(FacebookSigninActivity.this, FacebookLoginActivity.class);
                    startActivity(j);


            }
        });

    }
}