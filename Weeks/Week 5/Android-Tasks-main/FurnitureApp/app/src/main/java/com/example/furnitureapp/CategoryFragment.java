package com.example.furnitureapp;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CategoryFragment extends Fragment implements CategoryAdapter.ItemClickListener{
    RecyclerView recyclerView;
    CategoryAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    MediaPlayer audio;

    public static CategoryFragment newInstance() {
        CategoryFragment fragment = new CategoryFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        intRecyclerView(view);
        return view;
    }

    public void intRecyclerView(View view){
        ArrayList<CategoryData> dataList=new ArrayList<>();
        dataList.add(new CategoryData("Tables",R.drawable.splashscreen));
        dataList.add(new CategoryData("Sofas",R.drawable.sofa));
        dataList.add(new CategoryData("Chairs",R.drawable.chair2));
        dataList.add(new CategoryData("Beds",R.drawable.bed));
        dataList.add(new CategoryData("Lampshades",R.drawable.lamp));
        dataList.add(new CategoryData("Bookcases",R.drawable.bookcase));

        recyclerView= view.findViewById(R.id.category_recyclerView);
        adapter=new CategoryAdapter(dataList,this);
        recyclerView.setAdapter(adapter);
        layoutManager= new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);

    }

    @Override
    public void onItemClick(CategoryData categoryData) {
        playClickAudio();
        Fragment fragment=ChairFragment.newInstance();
        getParentFragmentManager() .beginTransaction()
                 .replace(R.id.fragmentContainer,fragment).commit();
    }

    public void playClickAudio(){
        audio = MediaPlayer.create(getContext(), R.raw.click_audio);
        audio.start();
        audio.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                audio.release();
            }
        });
    }

}