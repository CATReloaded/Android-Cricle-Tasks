package com.example.furnitureapp;

public class ChairData {
    private int chair_img;
    private String chair_price;
    private String chair_name;

    public int getChair_img() {
        return chair_img;
    }

    public String getChair_name() {
        return chair_name;
    }

    public String getChair_price() {
        return chair_price;
    }

    public ChairData(int img, String name, String price){
        chair_img=img;
        chair_name=name;
        chair_price=price;
    }
}
