package com.example.appmovil;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appmovil.adapters.HomeHorAdapter;
import com.example.appmovil.models.HomeHorModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView homeHorizontalRec;
    List<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);

        homeHorModelList = new ArrayList<>();

        homeHorModelList.add(new HomeHorModel(R.drawable.ic_baseline_computer_24,"Componente 1"));
        homeHorModelList.add(new HomeHorModel(R.drawable.ic_baseline_computer_24,"Componente 2"));
        homeHorModelList.add(new HomeHorModel(R.drawable.ic_baseline_computer_24,"Componente 3"));
        homeHorModelList.add(new HomeHorModel(R.drawable.ic_baseline_computer_24,"Componente 4"));
        homeHorModelList.add(new HomeHorModel(R.drawable.ic_baseline_computer_24,"Componente 5"));

        homeHorAdapter = new HomeHorAdapter(getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);

        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        return root;
    }
}