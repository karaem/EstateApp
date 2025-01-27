package com.example.estateapp.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.estateapp.R;
import com.example.estateapp.databinding.ActivitySplash1Binding;
import com.example.estateapp.ui.Landing_Page;

public class SplashActivity1 extends AppCompatActivity {
    ActivitySplash1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding =ActivitySplash1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.skipButton.setOnClickListener(view -> {
            Intent intent =new Intent(SplashActivity1.this, Landing_Page.class);
            startActivity(intent);
        });


        binding.nextButton.setOnClickListener(view -> {
            Intent intent =new Intent(SplashActivity1.this, SplashActivity2.class);
            startActivity(intent);

        });

    }
}