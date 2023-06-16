package com.bt.lab3;

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

public class bai9_2_adapter extends ArrayAdapter {
    Context context;
    int layoutItem;
    ArrayList<bai9_2_class> data;

    public bai9_2_adapter(@NonNull Context context, int layoutItem , @NonNull ArrayList<bai9_2_class>data) {
        super(context,layoutItem, data);
        this.context = context;
        this.layoutItem = layoutItem;
        this.data =data;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        bai9_2_class item = data.get(position);
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(layoutItem,null);
            ImageView imageItem = convertView.findViewById(R.id.bai9_3_img);
            imageItem.setImageResource(item.getImageID());
            TextView titleItem = convertView.findViewById(R.id.bai9_3_title);
            titleItem.setText(item.getTitleItem());
            TextView priceItem = convertView.findViewById(R.id.bai9_3_desc);
            priceItem.setText((item.getDescItem()));
        }
        return convertView;

    }
}
