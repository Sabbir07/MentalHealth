package com.sabbir.preneurlab.mentalhealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button generalButton,
                    measurementButton,
                    rememberingChildhoodButton,
                    othersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //setting action bar icon and text properties
        Toolbar toolbar = findViewById(R.id.mCustomToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("  Mental Health");
        getSupportActionBar().setIcon(getDrawable(R.drawable.ic_action_name));
        toolbar.setTitleTextColor(getResources().getColor(R.color.iconTintColorFrontPageButton));


        generalButton = findViewById(R.id.generalQuestion);
        measurementButton = findViewById(R.id.measurementQuestion);
        rememberingChildhoodButton = findViewById(R.id.rememberingChildhood);
        othersButton = findViewById(R.id.others);

        generalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, GeneralQuestion.class);
                startActivity(i);
            }
        });

        measurementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, MeasurementQuestion.class);
                startActivity(i);
            }
        });

        rememberingChildhoodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, RememberingChildhood.class);
                startActivity(i);
            }
        });

        othersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, OtherQuestions.class);
                startActivity(i);
            }
        });
    }
}