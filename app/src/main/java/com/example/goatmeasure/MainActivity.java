package com.example.goatmeasure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button maleButton;
    private Button femaleButton;
    private Button aboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        maleButton = (Button) findViewById(R.id.btnmale);

        femaleButton = (Button) findViewById(R.id.btnfemale);

        aboutButton = (Button) findViewById(R.id.btnAbt);



        maleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMale();
            }
        });

        femaleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFemale();
            }
        });
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAbout();
            }
        });
    }

    private void openAbout() {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    private void openFemale() {
        Intent intent = new Intent(this, FemaleActivity.class);
        startActivity(intent);
    }

    private void openMale() {
        Intent intent = new Intent(this, MaleActivity.class);
        startActivity(intent);
    }
}