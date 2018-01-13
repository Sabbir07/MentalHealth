package com.sabbir.preneurlab.mentalhealth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by Sabbir on 1/10/2018.
 */

public class MeasurementQuestion extends AppCompatActivity{

    private TextView textView;
    private RadioGroup radioGroup;
    private Button buttonNext;
    private Button radioButton,
                    radioButton2,
                    radioButton3,
                    radioButton4,
                    radioButton5,
                    radioButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.measurement_question);

        //setting action bar icon and text properties
        Toolbar toolbar = findViewById(R.id.mCustomToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("  Mental Health");
        getSupportActionBar().setIcon(getDrawable(R.drawable.ic_action_name));
        toolbar.setTitleTextColor(getResources().getColor(R.color.iconTintColorFrontPageButton));

        radioGroup = findViewById(R.id.radioGroup);
        buttonNext = findViewById(R.id.button);


        textView = findViewById(R.id.textView);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        radioButton5 = findViewById(R.id.radioButton5);
        radioButton6 = findViewById(R.id.radioButton6);


        textView.setText("What brings your happiness?");
        radioButton.setText("Eating Food");
        radioButton2.setText("When you get a nice gift");
        radioButton3.setText("Hearing good news");
        radioButton4.setText("Create a new idea");
        radioButton5.setText("Gossiping with friends");
        radioButton6.setText("Others");


        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(selectedId);

                /*

                //Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
                if (radioButton.getText().toString().equals("Human"))
                {
*//*                    Toast.makeText(MainActivity.this, "Right Answer --" + radioButton.getText(),
                                                                Toast.LENGTH_SHORT).show();     *//*
                    Toast.makeText(MainActivity.this, "Right Answer",
                            Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Wrong Answer",
                            Toast.LENGTH_SHORT).show();
                }
                */

            }
        });

    }
}