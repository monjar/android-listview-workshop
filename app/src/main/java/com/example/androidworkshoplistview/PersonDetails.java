package com.example.androidworkshoplistview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PersonDetails extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);
        Intent intent = getIntent();
        Person person = (Person) intent.getSerializableExtra("personInfo");

        TextView name = findViewById(R.id.detailName);
        TextView bDay = findViewById(R.id.detailBday);

        name.setText(person.getName());
        name.setText(person.getBirthday());
    }
}
