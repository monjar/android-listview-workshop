package com.example.androidworkshoplistview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.Objects;

public class PersonListAdapter extends ArrayAdapter<Person> {
    private Context mContext;
    private int mResource;

    private static class ViewHolder {

        TextView nameView;
        TextView bdayView;
        TextView sexView;

    }

    public PersonListAdapter(@NonNull Context context, int resource, @NonNull List<Person> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Person person = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(this.mContext);
            convertView = inflater.inflate(this.mResource, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.nameView = convertView.findViewById(R.id.nameView);
            viewHolder.bdayView = convertView.findViewById(R.id.bdayView);
            viewHolder.sexView = convertView.findViewById(R.id.sexView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Animation animation = AnimationUtils.loadAnimation(mContext,R.anim.item_come_in);
        convertView.startAnimation(animation);
        viewHolder.nameView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(mContext, "CLICKEDDDD!!!", Toast.LENGTH_SHORT);
                toast.show();

                Intent intent = new Intent(mContext, PersonDetails.class);
                intent.putExtra("personInfo", person);
                mContext.startActivity(intent);
            }
        });

        viewHolder.nameView.setText(Objects.requireNonNull(person).getName());
        viewHolder.bdayView.setText(person.getBirthday());
        viewHolder.sexView.setText(person.getSex());
//        LayoutInflater inflater = LayoutInflater.from(this.mContext);
//        convertView = inflater.inflate(this.mResource, parent, false);
//        TextView nameView = convertView.findViewById(R.id.nameView);
//        TextView bdayView = convertView.findViewById(R.id.bdayView);
//        TextView sexView = convertView.findViewById(R.id.sexView);
//
//        nameView.setText(person.getName());
//        bdayView.setText(person.getBirthday());
//        sexView.setText(person.getSex());
        return convertView;


    }
}
