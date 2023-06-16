package com.bt.lab3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BT7b extends AppCompatActivity {

    RecyclerView recy;
    ArrayList<Film> arrayListFilm = new ArrayList<>();
    CustomAdapterRecyFilm adapter;

    int[] lstImg = new int[]{R.drawable.icon1, R.drawable.icon2,R.drawable.icon3,
            R.drawable.icon4,R.drawable.icon5,R.drawable.icon6};
    String[]lstName= new String[]{"VietNam Film","Japan Film","United States Film","Russia Film","United States Film","Korea Film"};
    String[]lstAuthor= new String[]{"Hoang Dung","Kashima Yato","Justin Beiber","Angela Issac","Phuong Trinh","Hae Yessung"};
    String[]lstYear= new String[]{"1990","1994","1995","1999","1990","2010"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt7b);
        addControl();

        arrayListFilm = Film.initData(lstImg,lstName,lstAuthor,lstYear);
        adapter = new CustomAdapterRecyFilm(arrayListFilm);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recy.setLayoutManager(layoutManager);
        recy.setAdapter(adapter);
    }
    private void addControl(){
        recy = findViewById(R.id.recyFilmb);
    }

}