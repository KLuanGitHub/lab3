package com.bt.lab3;

import java.util.ArrayList;

public class Film {
    int idImg;
    String name,author,year;

    public Film(int idImg, String name, String author, String year) {
        this.idImg = idImg;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public int getIdImg() {
        return idImg;
    }

    public void setIdImg(int idImg) {
        this.idImg = idImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public static ArrayList<Film> initData(int[] lstImg, String []lstName, String []lstAuthor, String []lstYear){
        ArrayList<Film> arrayListFilm = new ArrayList<>();
        for(int i =0; i<lstImg.length;i++){
            Film film = new Film(lstImg[i],lstName[i],lstAuthor[i],lstYear[i]);
            arrayListFilm.add(film);
        }
        return arrayListFilm;
    }
}
