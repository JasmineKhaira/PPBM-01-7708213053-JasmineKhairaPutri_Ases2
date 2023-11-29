package com.example.listviewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ManualBrewAdapter extends ArrayAdapter<ManualBrew> {
    private Context mContext;
    private int mResource;

    public ManualBrewAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ManualBrew> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource,parent,false);

        ImageView imageView = convertView.findViewById(R.id.manualbrewImg);

        TextView txtName = convertView.findViewById(R.id.NameTxt);

        TextView txtDesc = convertView.findViewById(R.id.DescTxt);

        imageView.setImageResource(getItem(position).getImage());

        txtName.setText(getItem(position).getName());

        txtDesc.setText(getItem(position).getDesc());

        return convertView;
    }
}
