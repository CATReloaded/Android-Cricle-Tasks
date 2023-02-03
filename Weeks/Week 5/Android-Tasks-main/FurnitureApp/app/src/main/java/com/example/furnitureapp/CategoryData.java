package com.example.furnitureapp;

public class CategoryData {

    private String category_name;
    private int category_img;

    public CategoryData(String name, int img){
        category_name=name;
        category_img=img;
    }

    public void setCategory_img(int category_img) {
        this.category_img = category_img;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public int getCategory_img() {
        return category_img;
    }

    public String getCategory_name() {
        return category_name;
    }
}
