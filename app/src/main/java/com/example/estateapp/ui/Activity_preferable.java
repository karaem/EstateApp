package com.example.estateapp.ui;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import java.util.Arrays;

import com.example.estateapp.Adapters.RealEstateAdapter;
import com.example.estateapp.R;
import com.example.estateapp.databinding.ActivityPreferableBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Activity_preferable extends AppCompatActivity {
    ActivityPreferableBinding binding;
    private RealEstateAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPreferableBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int numberOfColumns = 3;
        binding.recyclerView.setLayoutManager(new GridLayoutManager(this,numberOfColumns));
        List<Integer> imageResIds =new ArrayList<>(Arrays.asList(
                R.drawable.grd1,
                R.drawable.grd2,
                R.drawable.grd3,
                R.drawable.grd4,
                R.drawable.grd5,
                R.drawable.grd6,
                R.drawable.grd7,
                R.drawable.grd8,
                R.drawable.grd9,
                R.drawable.grd10,
                R.drawable.grd12,
                R.drawable.grd13,
                R.drawable.grd14,
                R.drawable.grd15

        ));
        adapter = new RealEstateAdapter(imageResIds);
        binding.recyclerView.setAdapter(adapter);

        binding.btnShowMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}