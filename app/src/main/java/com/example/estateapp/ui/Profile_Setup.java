package com.example.estateapp.ui;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.estateapp.R;
import com.example.estateapp.databinding.ActivityProfileSetupBinding;

public class Profile_Setup extends AppCompatActivity {
    ActivityProfileSetupBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityProfileSetupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}