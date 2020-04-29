package com.example.androidworkshoplistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PersonListAdapter extends ArrayAdapter<Person> {
    private Context mContext;
    private int mResource;
    public PersonListAdapter(@NonNull Context context, int resource, @NonNull List<Person> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Person person = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(this.mContext);
        convertView = inflater.inflate(this.mResource, parent,false);
        TextView nameView =  convertView.findViewById(R.id.nameView);
        TextView bdayView =  convertView.findViewById(R.id.bdayView);
        TextView sexView =  convertView.findViewById(R.id.sexView);

        nameView.setText(person.getName());
        bdayView.setText(person.getBirthday());
        sexView.setText(person.getSex());
        return convertView;


    }
}
