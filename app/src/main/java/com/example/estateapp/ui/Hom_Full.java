package com.example.estateapp.ui;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.estateapp.R;
import com.example.estateapp.databinding.ActivityHomFullBinding;

public class Hom_Full extends AppCompatActivity {
    ActivityHomFullBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityHomFullBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View.OnClickListener buttonClickListener =view -> {
            resetButtonStyles();
            view.setBackgroundResource(R.drawable.button_background);

        };

    }
    private void resetButtonStyles() {
        binding.btuAll.setBackgroundResource(R.drawable.button_background_selected);
        binding.btuHouse.setBackgroundResource(R.drawable.button_background_selected);
        binding.btuApartment.setBackgroundResource(R.drawable.button_background_selected);
    }
    }