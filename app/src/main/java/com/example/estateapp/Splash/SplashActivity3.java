package com.example.estateapp.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.estateapp.R;
import com.example.estateapp.databinding.ActivitySplash3Binding;
import com.example.estateapp.ui.Landing_Page;

public class SplashActivity3 extends AppCompatActivity {
    ActivitySplash3Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        binding =ActivitySplash3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity3.this, SplashActivity1.class); // استبدل بـ OnboardingActivity
            startActivity(intent);
            finish(); // إنهاء النشاط الحالي
        }, 3000); // 3000 مللي ثانية


        binding.SplashBt.setOnClickListener(view -> {

            Intent intent =new Intent(SplashActivity3.this, Landing_Page.class);
            startActivity(intent);

        });
    }
}