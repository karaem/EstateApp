package com.example.estateapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.estateapp.R;
import com.example.estateapp.database.EstateAppRoomDatabase;
import com.example.estateapp.databinding.ActivityLoginScreenBinding;
import com.example.estateapp.model.User;

public class Login_Screen extends AppCompatActivity {

    private ActivityLoginScreenBinding binding;
    private EstateAppRoomDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityLoginScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        database = EstateAppRoomDatabase.getInstance(this);

        initViews();
    }

    private void initViews() {

        binding.register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_Screen.this, Register_From_Empty.class));
            }
        });

        binding.loginButton.setOnClickListener(view -> {
            String email = binding.emailEditText.getText().toString().trim();
            String password = binding.passwordEditText.getText().toString().trim();


            if (database.userDao().isUserExists(email) == 0) {
                Toast.makeText(Login_Screen.this, "the user is not exist", Toast.LENGTH_SHORT).show();
            }

//            User user = database.userDao().insert(user);

//            if (user != null) {
//                Toast.makeText(Login_Screen.this, "Login Successful", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(Login_Screen.this, Hom_Full.class);
//                intent.putExtra("user_id", user.getId());
//                startActivity(intent);
//            } else {
//                Toast.makeText(Login_Screen.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
//            }
        });
    }
}