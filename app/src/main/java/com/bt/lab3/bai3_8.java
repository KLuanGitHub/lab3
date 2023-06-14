package com.bt.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class bai3_8 extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        addControl();
        addEvent();

    }
    private void  addControl(){
        gridView = (GridView) findViewById(R.id.bai3_gridView);

    }
    private void  addEvent(){
        List<bai3_Country> image_detail =getListData();
        gridView.setAdapter(new bai3_adapter(this,image_detail));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               /* Object o = gridView.getItemAtPosition(position);*/
                /*bai3_Country country = (bai3_Country) o;
                Toast.makeText(bai3.this, "Selected :"
                        + " " + country, Toast.LENGTH_LONG).show();*/
                view.setBackgroundColor(getResources().getColor(R.color.grid_item_background_color));

            }
        });
    }

    private  List<bai3_Country> getListData(){
        List<bai3_Country> list = new ArrayList<bai3_Country>();
        bai3_Country vn = new bai3_Country("VietNam","vn",980000000);
        bai3_Country usa = new bai3_Country("US","us",320000000);
        bai3_Country aus = new bai3_Country("AUS","aus",23766305);
        bai3_Country japan = new bai3_Country("Japan","jp",126788677);
        bai3_Country russia = new bai3_Country("Russia", "rus", 142000000);
        list.add(vn);
        list.add(usa);
        list.add(aus);
        list.add(japan);
        list.add(russia);
        return list;
    }
}