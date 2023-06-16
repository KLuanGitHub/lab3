package com.bt.lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class bai9_adapter extends BaseAdapter {
    Context context;
    int icons[];
    String titles[];
    LayoutInflater inflater;
    public bai9_adapter(Context applicationContext, int[] logos, String[] titles) {
        this.context = applicationContext;
        this.icons = logos;
        this.titles = titles;
        inflater = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return icons.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.bai9_4, null);
        ImageView icon = (ImageView) view.findViewById(R.id.bai9_4_img);
        TextView title =  view.findViewById(R.id.bai9_4_txt);
        icon.setImageResource(icons[i]);
        title.setText(titles[i]);
        return view;
    }
}
