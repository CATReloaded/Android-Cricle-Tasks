package com.example.furnitureapp;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;

public class ChairFragment extends Fragment implements ChairAdapter.CategoryClickListener {

    public static ChairFragment newInstance() {
        ChairFragment fragment = new ChairFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_chair, container, false);
        iniChairsRecyclerView(view);
        return view;
    }

    public void iniChairsRecyclerView(View view){
        ArrayList<ChairData> dataset=new ArrayList<>();
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));
        dataset.add(new ChairData(R.drawable.chair,"chair","160$"));

        RecyclerView recyclerView=view.findViewById(R.id.chair_recyclerView);
        ChairAdapter chairAdapter=new ChairAdapter(dataset,this);
        recyclerView.setAdapter(chairAdapter);
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void onClickCategory(ChairData chairData) {
        Fragment fragment = ChairDetailFragment.newInstance(chairData);
        getParentFragmentManager() .beginTransaction()
                .replace(R.id.fragmentContainer,fragment).commit();
    }

}