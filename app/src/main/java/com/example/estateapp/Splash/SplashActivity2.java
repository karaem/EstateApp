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
import com.example.estateapp.databinding.ActivitySplash2Binding;
import com.example.estateapp.ui.Landing_Page;

public class SplashActivity2 extends AppCompatActivity {
    ActivitySplash2Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding =ActivitySplash2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.skipButton.setOnClickListener(view -> {
            Intent intent =new Intent(SplashActivity2.this, Landing_Page.class);
            startActivity(intent);
        });

        binding.nextButton.setOnClickListener(view -> {
                Intent intent =new Intent(SplashActivity2.this, SplashActivity3.class);
                startActivity(intent);

        });
        binding.backBt.setOnClickListener(view -> {


                Intent intent =new Intent(SplashActivity2.this, SplashActivity1.class);
                startActivity(intent);
            });








    }
}