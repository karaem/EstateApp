package com.example.estateapp.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.viewpager.widget.PagerAdapter;

import com.example.estateapp.Adapters.PropertyAdapter;
import com.example.estateapp.Java.Property;
import com.example.estateapp.R;
import com.example.estateapp.databinding.ActivitySelectPreferredBinding;


import org.xml.sax.helpers.ParserAdapter;

import java.util.ArrayList;
import java.util.List;

public class Select_Preferred extends AppCompatActivity {
    ActivitySelectPreferredBinding binding;
//    private PagerAdapter adapter;
    private PropertyAdapter propertyAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivitySelectPreferredBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        List<Property> properties = getPropertyList();
//        adapter =new ParserAdapter(properties);
        propertyAdapter = new PropertyAdapter(properties);

        binding.recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        binding.recyclerView.setAdapter(propertyAdapter);
        binding.nextButton.setOnClickListener(v -> {
            // قم بتنفيذ الإجراء المطلوب عند النقر على "Next"
        });
    }



    private List<Property> getPropertyList() {
        List<Property> properties = new ArrayList<>();
        properties.add(new Property("Apartment", R.drawable.grd1));
        properties.add(new Property("Villa", R.drawable.grd2));
        properties.add(new Property("House", R.drawable.grd3));
        properties.add(new Property("Cottage", R.drawable.grd4));
        return properties;
    }
}