package com.bt.lab3;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class bai3_adapter extends BaseAdapter {
    private List<bai3_Country> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public bai3_adapter(Context acontext,List<bai3_Country> listData ) {
        this.listData = listData;
        this.context = acontext;
        layoutInflater = LayoutInflater.from(acontext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            convertView = layoutInflater.inflate(R.layout.grid_item_layout,null);
            holder = new ViewHolder();
            holder.flagView = (ImageView) convertView.findViewById(R.id.imageView_flag);
            holder.countryNameView = (TextView) convertView.findViewById(R.id.textView_countryName);
            holder.populationView = (TextView) convertView.findViewById(R.id.textView_population);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        bai3_Country country = this .listData.get(position);
        holder.countryNameView.setText(country.getCountryName());
        holder.populationView.setText(""+country.getPopulation());
        int imageID = this.getMipmapResIdByName(country.getFlagName());
        holder.flagView.setImageResource(imageID);
        return convertView;
    }
    public int getMipmapResIdByName(String resName) {
        String pkgName = context.getPackageName();
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.d("CustomGridView", "Res Name: " + resName + "==> Res ID = " + resID);
        return resID;
    }
    static class ViewHolder {
        ImageView flagView;
        TextView countryNameView;
        TextView populationView;
    }
}
