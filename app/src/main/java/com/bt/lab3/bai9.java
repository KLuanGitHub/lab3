package com.bt.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class bai9 extends AppCompatActivity {
    GridView simpleGrid;
    int logos[] = {R.drawable.icon1, R.drawable.icon2, R.drawable.icon3, R.drawable.icon4, R.drawable.icon5, R.drawable.icon6, R.drawable.icon7, R.drawable.icon8, R.drawable.icon9};
    String titles[] = {"Cars & Bikes", "Mobiles & Tablets", "Electronics & Appliances", "Real Estate", "Home & Lifestyle", "Jobs","Services","Entertainment","Education & Learning" };
    String[][] descs = {
            {"Toyota", "Lamborghini", "Ferrari", "Nissan", "Maserati"},
            {"iPhone 13", "iPhone 14", "iPad Pro", "Samsung Galaxy 20", "Samsung Galaxy 21"},
            {"TV", "Refrigerator", "Washing Machine", "Air Conditioner", "Laptop"},
            {"House", "Apartment", "Condo", "Land", "Commercial Property"}, // Real Estate
            {"Furniture", "Home Decor", "Kitchen Appliances", "Bedding", "Lighting"},
            {"Software Developer", "Marketing Manager", "Sales Representative", "Accountant", "Graphic Designer"},
            {"Plumbing", "Catering", "Electrician", "Home Cleaning", "Gardening"},
            {"Movies", "Music", "Books", "Games", "Sports"},
            {"Language Courses", "Math Tutoring", "Programming Classes", "Art Lessons", "Music Education"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai9);
        simpleGrid = (GridView) findViewById(R.id.bai9_grid);
        bai9_adapter customAdapter = new bai9_adapter(getApplicationContext(), logos,titles);
        simpleGrid.setAdapter(customAdapter);
        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(bai9.this, bai9_2.class);
                intent.putExtra("image", logos[position]);
                intent.putExtra("title", titles[position]);
                intent.putExtra("desc", descs[position]);
                startActivity(intent);

            }
        });
    }
}