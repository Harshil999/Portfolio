package com.harshil.example.portfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    Button btnSpotify;
    Button btnFootball;
    Button btnLibrary;
    Button btnBuildItBigger;
    Button btnXyzReader;
    Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSpotify= (Button) findViewById(R.id.btnSpotify);
        btnFootball= (Button) findViewById(R.id.btnFootball);
        btnLibrary= (Button) findViewById(R.id.btnLibrary);
        btnBuildItBigger= (Button) findViewById(R.id.btnBuildItBigger);
        btnXyzReader= (Button) findViewById(R.id.btnXyzReader);
        btnCapstone= (Button) findViewById(R.id.btnCapstone);

        btnSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my spotify app!",Toast.LENGTH_LONG).show();
            }
        });
        btnFootball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my Football app!",Toast.LENGTH_LONG).show();
            }
        });
        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my Library app!",Toast.LENGTH_LONG).show();
            }
        });
        btnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my Build It Bigger app!",Toast.LENGTH_LONG).show();
            }
        });
        btnXyzReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my Xyz Reader app!",Toast.LENGTH_LONG).show();
            }
        });
        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my Capstone app!",Toast.LENGTH_LONG).show();
            }
        });
    }


}
