package com.lightidea.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.afollestad.materialdialogs.MaterialDialog;

import java.util.Calendar;

public class DialogActivity extends AppCompatActivity {
    Button btnquick;
    Button btnmaterial;
DatePickerDialog date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        btnquick = (Button) findViewById(R.id.quickbtn);
        btnmaterial=(Button)findViewById(R.id.materialbtn);
        btnmaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MaterialDialog.Builder dialog1=new MaterialDialog.Builder(v.getContext());
                dialog1.title("Material Dialog")
                        .content(("Content"))

                        .positiveText("Agree")

                        .negativeText("Disagree")

                        .show();;
            }
        });
        btnquick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(v.getContext());
                alert.setMessage("Are you sure to close");
                alert.setTitle("Flash Tour Myanmar");
                alert.setCancelable(true);
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                    }


                });
                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }

                });
                alert.show();

            }
        });
          Calendar c=  Calendar.getInstance();
        final int myear=c.get(Calendar.YEAR);
        int mmonth=c.get(Calendar.MONTH);
        int mday=c.get(Calendar.DAY_OF_MONTH);
        date=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                btnquick.setText(dayOfMonth+"/"+year);

            }
        },myear,mmonth,mday);
        date.show();
    }
}
