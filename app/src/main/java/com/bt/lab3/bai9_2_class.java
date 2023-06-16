package com.bt.lab3;

import java.util.ArrayList;

public class bai9_2_class {
    int imageID;
    String titleItem;
    String descItem;

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitleItem() {
        return titleItem;
    }

    public void setTitleItem(String titleItem) {
        this.titleItem = titleItem;
    }

    public String getDescItem() {
        return descItem;
    }

    public void setDescItem(String descItem) {
        this.descItem = descItem;
    }

    public bai9_2_class(int imageID, String titleItem, String descItem) {
        this.imageID = imageID;
        this.titleItem = titleItem;
        this.descItem = descItem;
    }

    public static ArrayList<bai9_2_class> initData(int[] imageList, String[] titleList, String[] descList){

        ArrayList<bai9_2_class> arrList = new ArrayList<>();

        for(int i= 0; i<imageList.length;i++){
            bai9_2_class item = new bai9_2_class(imageList[i],titleList[i],descList[i]);
            arrList.add(item);
        }
        return  arrList;
    }


}
