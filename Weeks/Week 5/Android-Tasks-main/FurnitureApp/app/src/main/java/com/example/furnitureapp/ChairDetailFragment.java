package com.example.furnitureapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ChairDetailFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static ChairData itemData;

    public static ChairDetailFragment newInstance(ChairData v) {
        ChairDetailFragment fragment = new ChairDetailFragment();
        itemData=v;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_chair_detail, container, false);
        ImageView imageView=view.findViewById(R.id.chair_detail_imageView);
        imageView.setImageResource(itemData.getChair_img());
        return view;
    }
}