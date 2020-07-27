package com.lightidea.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity2 extends AppCompatActivity {
    Button btnzero, btnone,btntwo,btnthree,btnfour,btnfive,btnsix,btnseven,btneight,btnnine,btndot,btnadd,btnminus,btnmul,
    btndiv,btnequal,btnpercent,btncancel,btncan;
    EditText texedit;
    float value1,value2;
    boolean addition,subtract,multi,div;
    double val1=Double.NaN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator2);
        btncan=(Button)findViewById(R.id.canbtn);
        btncancel=(Button)findViewById(R.id.cancelbtn);
        btnzero=(Button)findViewById(R.id.zerobtn);
        btnone=(Button)findViewById(R.id.onebtn);
        btntwo=(Button)findViewById(R.id.twobtn);
        btnthree=(Button)findViewById(R.id.threebtn);
        btnfour=(Button)findViewById(R.id.fourbtn);
        btnfive=(Button)findViewById(R.id.fivebtn);
        btnsix=(Button)findViewById(R.id.sixbtn);
        btnseven=(Button)findViewById(R.id.sevenbtn);
        btneight=(Button)findViewById(R.id.eightbtn);
        btnnine=(Button)findViewById(R.id.ninebtn);
        btndot=(Button)findViewById(R.id.dotbtn);
        btnadd=(Button)findViewById(R.id.addbtn);
        btnminus=(Button)findViewById(R.id.minusbtn);
        btnmul=(Button)findViewById(R.id.mulbtn);
        btndiv=(Button)findViewById(R.id.divbtn);
        btnequal=(Button)findViewById(R.id.equalbtn);
        btnpercent=(Button)findViewById(R.id.percentbtn);
        texedit=(EditText)findViewById(R.id.edittex);
        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texedit.setText(texedit.getText()+"0");

            }
        });
        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texedit.setText(texedit.getText()+"1");

            }
        });
        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texedit.setText(texedit.getText()+"2");

            }
        });
        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texedit.setText(texedit.getText()+"3");

            }
        });
        btnfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texedit.setText(texedit.getText()+"4");

            }
        });
        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texedit.setText(texedit.getText()+"5");

            }
        });
        btnsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texedit.setText(texedit.getText()+"6");

            }
        });
        btnseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texedit.setText(texedit.getText()+"7");

            }
        });
        btneight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texedit.setText(texedit.getText()+"8");

            }
        });
        btnnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texedit.setText(texedit.getText()+"9");

            }
        });
        btncan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                texedit.setText("");

            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1=Float.parseFloat(texedit.getText()+"");
                addition=true;
                texedit.setText(texedit.getText()+"+");


            }
        });


                btnminus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        value1 = Float.parseFloat(texedit.getText() + "");
                        subtract = true;
                        texedit.setText(texedit.getText() + "-");


                    }
                });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                value1=Float.parseFloat(texedit.getText()+"");
                multi=true;
                texedit.setText(texedit.getText()+"*");


            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                value1=Float.parseFloat(texedit.getText()+"");
                div=true;
                texedit.setText(texedit.getText()+"/");


            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String str=texedit.getText().toString();
                String[] strArray=str.split("\\+");
                if (addition==true) {
                    texedit.setText (Float.parseFloat(strArray[0])+Float.parseFloat(strArray[1])+"");
                    addition=false;
                }


                if (subtract==true) {
                    String[] strArray1 =str.split("\\-");
                    texedit.setText (Float.parseFloat(strArray1[0])-Float.parseFloat(strArray1[1])+"");
                    subtract=false;

                }
                if (multi==true){
                    String[] strArray1=str.split("\\*");
                    texedit.setText(value1*value2+"");
                    texedit.setText (Float.parseFloat(strArray1[0])*Float.parseFloat(strArray1[1])+"");
                    multi=false;
                }
                if (div==true){
                    String[] strArray1=str.split("\\/");
                    texedit.setText (Float.parseFloat(strArray1[0])/Float.parseFloat(strArray1[1])+"");
                    div=false;
                }


            }
        });
       btndot.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               texedit.setText(texedit.getText()+".");
           }
       });
    }
}