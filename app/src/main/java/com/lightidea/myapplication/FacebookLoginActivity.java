package com.lightidea.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FacebookLoginActivity extends AppCompatActivity {
    public Button btnlogin;
    public EditText txtmail;
    public EditText txtpassword;
    public Button btncreate;
    DatePickerDialog date;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_login);
        txtmail = (EditText) findViewById(R.id.mailtxt);
        txtpassword = (EditText) findViewById(R.id.passwordtxt);
        btnlogin = (Button) findViewById(R.id.loginbtn);
        btncreate = (Button) findViewById(R.id.createbtn);
        btncreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacebookLoginActivity.this, FacebookSigninActivity.class);
                startActivity(intent);
            }
            });

                btnlogin.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        if (txtmail.getText().toString().equals("lightidea")) {
                            if (txtpassword.getText().toString().equals("123456")) {
                        Intent i = new Intent(FacebookLoginActivity.this, SuccessActivity.class);
                        i.putExtra("mail", txtmail.getText().toString());

                        startActivity(i);
                                //Toast.makeText(FacebookLoginActivity.this,txtmail.getText().toString(),Toast.LENGTH_LONG).show();
                            } else
                                Toast.makeText(FacebookLoginActivity.this, " invalid password", Toast.LENGTH_SHORT).show();
                        } else
                            Toast.makeText(FacebookLoginActivity.this, " wrong Email", Toast.LENGTH_SHORT).show();

                    }
                });
                /* Calendar c=  Calendar.getInstance();
        final int myear=c.get(Calendar.YEAR);
        int mmonth=c.get(Calendar.MONTH);
        int mday=c.get(Calendar.DAY_OF_MONTH);
        date=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                btnquick.setText(dayOfMonth+"/"+year);

            }
        },myear,mmonth,mday);
        date.show();*/
            }

        }




