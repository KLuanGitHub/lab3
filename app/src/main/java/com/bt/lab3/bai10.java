package com.bt.lab3;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bai10 extends AppCompatActivity {
    GridView grid;
    int[] imgs = {R.drawable.icon1, R.drawable.icon2, R.drawable.icon3, R.drawable.icon4, R.drawable.icon5, R.drawable.icon6, R.drawable.icon7, R.drawable.icon8};
    String[] titles = {"Cars & Bikes", "Mobiles & Tablets", "Electronics & Appliances", "Real Estate", "Home & Lifestyle", "Jobs", "Services", "Entertainment", "Education & Learning"};

    boolean[] checks = {false,false,false,false,false,false,false,false};

    List<String> selected = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai10);
        grid = findViewById(R.id.bai10_grid);
        setAdapter();
    }

    public void setAdapter(){
        bai10_adapter adapter = new bai10_adapter(getApplicationContext(),this, imgs, titles,checks);
        grid.setAdapter(adapter);
    }

    public void onCheckAll(View v) {
        selected.clear();
        selected.addAll(Arrays.asList(titles));
        boolean[] newChecks = {true, true, true, true, true, true, true, true};
        checks = newChecks.clone();
        setAdapter();
    }

    public void onUncheckAll(View v) {
        selected.clear();
        boolean[] newChecks = {false, false, false, false, false, false, false, false};
        checks = newChecks.clone();
        setAdapter();
    }

    public void getChecked(View v) {
        Toast toast = Toast.makeText(this, "Checked items: " + selected, Toast.LENGTH_LONG);
        toast.show();
    }
}