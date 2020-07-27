package com.lightidea.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.FileObserver;
import android.widget.TextView;
import android.widget.Toast;

public class SuccessActivity extends AppCompatActivity {
    String moe;
    TextView texsuccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        texsuccess=(TextView) findViewById(R.id.successtex);
        moe=getIntent().getStringExtra("mail");
        Toast.makeText(this, moe.toString(), Toast.LENGTH_LONG).show();
        texsuccess.setText(moe);
    }
}