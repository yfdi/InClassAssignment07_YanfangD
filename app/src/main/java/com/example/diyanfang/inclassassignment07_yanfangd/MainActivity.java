package com.example.diyanfang.inclassassignment07_yanfangd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    EditText nameText;
    EditText ageText;
    CheckBox isGraduatedText;

    String name;
    int age;
    boolean isGraduated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = findViewById(R.id.name_text);
        ageText = findViewById(R.id.age_text);
        isGraduatedText = findViewById(R.id.is_graduated_checkbox);
    }

    public void submit(View view){

        name = nameText.getText().toString();
        age = Integer.parseInt(ageText.getText().toString());
        isGraduated = Boolean.valueOf(isGraduatedText.getText().toString());

        //then create an object with constructor that accepts everything
        //and pass it to the second activity
        Person person = new Person(name, age, isGraduated);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(Keys.PERSON, (Serializable) person);

        startActivity(intent);

    }
}
