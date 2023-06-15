package com.bt.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class bai5 extends AppCompatActivity {

    Spinner spinner;
    int[] imgs = {R.drawable.c_sharp, R.drawable.html, R.drawable.php, R.drawable.xml};
    String[] titles = {"C# Language", "HTML Language", "PHP Language", "XML Language"};
    List<String> selected = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);
        spinner = findViewById(R.id.bai5_spinner);
        setAdapter();
    }

    public void setAdapter(){
        bai5_adapter adapter = new bai5_adapter(getApplicationContext(), imgs, titles);
        spinner.setAdapter(adapter);
    }

}