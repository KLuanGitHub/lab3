package com.bt.lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class bai4 extends AppCompatActivity {
    private List<bai4_Movies> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private bai4_MoviesAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        mAdapter = new bai4_MoviesAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManage = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManage);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }

    private void prepareMovieData() {
        bai4_Movies movie = new bai4_Movies("Mad Max: Fury Road", "Action & Adventure", "2015");
        movieList.add(movie);
        movie = new bai4_Movies("Inside Out", "Animation, Kids & Family", "2015");
        movieList.add(movie);
        movie = new bai4_Movies("Star Wars, Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);
        movie = new bai4_Movies("Star Wars, Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);
        movie = new bai4_Movies("Star Wars, Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);
        movie = new bai4_Movies("Star Wars, Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);
        mAdapter.notifyDataSetChanged();
        Log.v("movies", movieList.toString());
    }
}