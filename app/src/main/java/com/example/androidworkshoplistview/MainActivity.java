package com.example.androidworkshoplistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    private List<Person> peopleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.peopleList = new ArrayList<>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "onCreate method called.");

        Person john = new Person("John", "12-20-1998", "Male");
        Person steve = new Person("Steve", "08-03-1987", "Male");
        Person stacy = new Person("Stacy", "11-15-2000", "Female");
        Person ashley = new Person("Ashley", "07-02-1999", "Female");
        Person matt = new Person("Matt", "03-29-2001", "Male");
        Person matt2 = new Person("Matt2", "03-29-2001", "Male");
        Person matt3 = new Person("Matt3", "03-29-2001", "Male");
        Person matt4 = new Person("Matt4", "03-29-2001", "Male");
        Person matt5 = new Person("Matt5", "03-29-2001", "Male");
        Person matt6 = new Person("Matt6", "03-29-2001", "Male");
        Person matt7 = new Person("Matt7", "03-29-2001", "Male");
        Person matt8 = new Person("Matt8", "03-29-2001", "Male");
        Person matt9 = new Person("Matt9", "03-29-2001", "Male");
        Person matt10 = new Person("Matt10", "03-29-2001", "Male");
        Person matt11 = new Person("Matt11", "03-29-2001", "Male");
        peopleList.add(john);
        peopleList.add(steve);
        peopleList.add(stacy);
        peopleList.add(ashley);
        peopleList.add(matt);
        peopleList.add(matt2);
        peopleList.add(matt3);
        peopleList.add(matt4);
        peopleList.add(matt5);
        peopleList.add(matt6);
        peopleList.add(matt7);
        peopleList.add(matt8);
        peopleList.add(matt9);
        peopleList.add(matt10);
        peopleList.add(matt11);

        ListView listView = findViewById(R.id.listView);
        List<String> stringList = peopleList.stream().map(Person::getName).collect(Collectors.toList());

//        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.single_adapter_layout, stringList);
        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.custom_adapter_layout,peopleList);
        listView.setAdapter(adapter);
    }
}
