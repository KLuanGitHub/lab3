package com.bt.lab3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapterRecyFilm extends RecyclerView.Adapter<CustomAdapterRecyFilm.MyViewHolder>{
    ArrayList<Film>arrayListFilm = new ArrayList<>();

    public CustomAdapterRecyFilm(ArrayList<Film> arrayListFilm) {
        this.arrayListFilm = arrayListFilm;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView idImg;
        TextView name;
        TextView author;
        TextView year;
        public MyViewHolder(View itemView) {
            super(itemView);
            idImg = itemView.findViewById(R.id.imgFilm);
            name = itemView.findViewById(R.id.tvnamefilm);
            author = itemView.findViewById(R.id.tvauthor);
            year = itemView.findViewById(R.id.tvyearfilm);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_recy_custom_film,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Film film = arrayListFilm.get(position);
        holder.idImg.setImageResource(film.getIdImg());
        holder.name.setText(film.getName());
        holder.author.setText(film.getAuthor());
        holder.year.setText(film.getYear());

    }

    @Override
    public int getItemCount() {
        return arrayListFilm.size();
    }


}
