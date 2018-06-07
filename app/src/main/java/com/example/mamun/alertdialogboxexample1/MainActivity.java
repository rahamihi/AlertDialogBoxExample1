package com.example.mamun.alertdialogboxexample1;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alertBox = new AlertDialog.Builder(MainActivity.this);

                alertBox.setTitle("AlertBox");
                alertBox.setMessage("This is my first alert box");

                alertBox.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //
                        Toast.makeText(getApplicationContext(),"Yes Button is clicked",Toast.LENGTH_LONG).show();

                    }
                });
                alertBox.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"No Button is clicked",Toast.LENGTH_LONG).show();
                    }
                });

                alertBox.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Neutral Button is clicked",Toast.LENGTH_LONG).show();
                    }
                });

                alertBox.show();
                

            }

        });



    }
}
