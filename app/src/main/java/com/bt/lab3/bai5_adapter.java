package com.bt.lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class bai5_adapter extends BaseAdapter {
    Context context;
    int imgs[];
    String[] titles;
    LayoutInflater inflater;

    public bai5_adapter(Context applicationContext, int[] imgs, String[] titles) {
        this.context = applicationContext;
        this.imgs = imgs;
        this.titles = titles;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return imgs.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public boolean isEnabled(int position) {
        if (position == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (i == 0) {
            view = inflater.inflate(R.layout.bai5_3, null);
            TextView textView = view.findViewById(R.id.bai5_3_txt);
        } else {
            view = inflater.inflate(R.layout.bai5_2, null);
            ImageView img = (ImageView) view.findViewById(R.id.bai5_2_img);
            TextView title = (TextView) view.findViewById(R.id.bai5_2_txt);
            img.setImageResource(imgs[i-1]);
            title.setText(titles[i-1]);
        }
        return view;
    }
}
