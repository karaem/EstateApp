package com.example.estateapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.estateapp.database.EstateAppRoomDatabase;
import com.example.estateapp.databinding.SplashScreenBinding;
import com.example.estateapp.model.User;
import com.example.estateapp.ui.Login_Screen;

public class MainActivity extends AppCompatActivity {

    private SplashScreenBinding binding;
    private EstateAppRoomDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        database = EstateAppRoomDatabase.getInstance(this);
        binding = SplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Log.e("getAllUsers", database.userDao().getAllUsers().size() + "");

        for (User allUser : database.userDao().getAllUsers()) {
            Log.e("getAllUsers: ", allUser.toString());
        }

        binding.listStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login_Screen.class);
                startActivity(intent);
            }
        });
    }
}