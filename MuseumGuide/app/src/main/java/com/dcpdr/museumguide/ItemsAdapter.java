package com.dcpdr.museumguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Picture> {

    public ItemsAdapter(Context context, int textViewResourceId,
            List<Picture> objects) {
        super(context, textViewResourceId, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
             .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.listactivity_row, null);
        TextView name = (TextView)convertView.findViewById(R.id.name);
        TextView author = (TextView)convertView.findViewById(R.id.author);
        ImageView image = (ImageView) convertView.findViewById(R.id.list_image);
        Picture c = getItem(position);
        name.setText(c.getName());
        author.setText(c.getAuthor());
        image.setImageResource(R.drawable.notte_icon);


        return convertView;
    }

}