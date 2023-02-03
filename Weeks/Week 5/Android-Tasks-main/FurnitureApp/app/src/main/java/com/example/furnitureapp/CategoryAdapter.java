package com.example.furnitureapp;


import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.Holder>{

    ArrayList<CategoryData> categoryDataList;
    private ItemClickListener clickListener;

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_design,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        CategoryData currentItem = categoryDataList.get(position);
        holder.categoryTextView.setText(currentItem.getCategory_name());
        holder.categoryImageView.setImageResource(currentItem.getCategory_img());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onItemClick(currentItem);
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryDataList.size();
    }

    public static class Holder extends RecyclerView.ViewHolder {
        ImageView categoryImageView;
        TextView categoryTextView;
        public Holder(View view){
            super(view);
            categoryTextView=view.findViewById(R.id.category_textView);
            categoryImageView=view.findViewById(R.id.category_imageView);
        }
    }
    public CategoryAdapter(ArrayList<CategoryData> categoryDataList,ItemClickListener itemClickListener){
        this.categoryDataList=categoryDataList;
        this.clickListener=clickListener;
    }

    public interface ItemClickListener{
        public void onItemClick(CategoryData categoryData);
    }
}



