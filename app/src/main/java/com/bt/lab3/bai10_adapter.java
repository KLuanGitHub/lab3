package com.bt.lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

public class bai10_adapter extends BaseAdapter {
    Context context;
    bai10 activity;
    int imgs[];
    String titles[];
    boolean checks[];
    LayoutInflater inflater;

    public bai10_adapter(Context applicationContext, bai10 activity, int[] imgs, String[] titles, boolean[] checks) {
        this.context = applicationContext;
        this.activity = activity;
        this.imgs = imgs;
        this.titles = titles;
        this.checks = checks;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.bai10_2, null);
        ImageView img = view.findViewById(R.id.bai10_2_img);
        CheckBox checkbox = view.findViewById(R.id.bai10_2_checkbox);
        img.setImageResource(imgs[i]);
        checkbox.setText(titles[i]);
        checkbox.setChecked(checks[i]);
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    Toast.makeText(context, "checked " + checkbox.getText().toString(), Toast.LENGTH_SHORT).show();
                    activity.selected.add(checkbox.getText().toString());
                } else {
                    Toast.makeText(context, "unchecked " + checkbox.getText().toString(), Toast.LENGTH_SHORT).show();
                    activity.selected.remove(checkbox.getText().toString());
                }
            }
        });
        return view;


    }

}