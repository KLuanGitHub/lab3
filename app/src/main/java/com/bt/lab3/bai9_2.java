package com.bt.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class bai9_2 extends AppCompatActivity {

    ListView customLv;
    ArrayList<bai9_2_class> data = new ArrayList<>();
    bai9_2_adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai92);
        Intent intent = getIntent();
        int[] image =  new int[] {intent.getIntExtra("image", 0),intent.getIntExtra("image", 0),intent.getIntExtra("image", 0),intent.getIntExtra("image", 0),intent.getIntExtra("image", 0)};
        String[] title =  new String[] {intent.getStringExtra("title"),intent.getStringExtra("title"),intent.getStringExtra("title"),intent.getStringExtra("title"),intent.getStringExtra("title")};
        String[] desc =  intent.getStringArrayExtra("desc");
        data = bai9_2_class.initData(image, title, desc);
        customLv = (ListView) findViewById(R.id.bai9_2_list);
        adapter = new bai9_2_adapter(bai9_2.this, R.layout.activity_bai93, data);
        customLv.setAdapter(adapter);
    }
}