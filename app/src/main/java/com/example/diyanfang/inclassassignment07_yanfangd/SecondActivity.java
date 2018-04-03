package com.example.diyanfang.inclassassignment07_yanfangd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //you'll need a variable to display text
    TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        displayText =  (TextView) findViewById(R.id.display_text);

        //getting object from main activity to second activity
        Intent intent = getIntent();
        Person per = (Person) intent.getSerializableExtra(Keys.PERSON);

        displayText.setText(per.toString());


//      String name = per.getName();
//      int age = per.getAge();
//      boolean isGraduated = per.isGraduated();
    }
}
