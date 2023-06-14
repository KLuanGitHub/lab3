package com.bt.lab3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class bai4_MoviesAdapter extends RecyclerView.Adapter<bai4_MoviesAdapter.MyViewHolder> {
    private List<bai4_Movies> moviesList;
    public class  MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, year, genre;
        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.bt4_title);
            genre = (TextView) view.findViewById(R.id.bt4_genre);
            year = (TextView) view.findViewById(R.id.year);
        }

    }
    public bai4_MoviesAdapter(List<bai4_Movies> moviesList) {
        this.moviesList = moviesList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_item_recyclerview, parent, false);
        return new MyViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        bai4_Movies movie = moviesList.get(position);

        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
