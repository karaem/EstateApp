package com.example.estateapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.estateapp.database.EstateAppRoomDatabase;
import com.example.estateapp.databinding.ActivityRegisterFromEmptyBinding;
import com.example.estateapp.model.User;

public class Register_From_Empty extends AppCompatActivity {

    ActivityRegisterFromEmptyBinding binding;
    private EstateAppRoomDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterFromEmptyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        database = EstateAppRoomDatabase.getInstance(this);
        initViews();

    }

    private void initViews() {
        binding.buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkForm();
            }
        });
    }

    private void checkForm() {
        String name = binding.editTextFullName.getText().toString().trim();
        String email = binding.editTextEmail.getText().toString().trim();
        String password = binding.editTextPassword.getText().toString().trim();

        if (name.isEmpty()) {
            Toast.makeText(this, "add name please", Toast.LENGTH_SHORT).show();
        } else if (email.isEmpty()) {
            Toast.makeText(this, "add email please", Toast.LENGTH_SHORT).show();
        } else if (password.isEmpty()) {
            Toast.makeText(this, "add password please", Toast.LENGTH_SHORT).show();
        } else if (isEmailExist(email)) {
            Toast.makeText(this, "email is taken", Toast.LENGTH_SHORT).show();
        } else {
            register(name, email, password);
        }
    }

    private void register(String name, String email, String password) {

        User user = new User(name, email, password);

        long id = database.userDao().insert(user);

        if (id > 0) {
            Toast.makeText(Register_From_Empty.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Register_From_Empty.this, Hom_Full.class);
            intent.putExtra("user_id", user.getId());
            startActivity(intent);
        } else {
//            Toast.makeText(Login_Screen.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
        }


        startActivity(new Intent(Register_From_Empty.this, Hom_Full.class));
        Toast.makeText(Register_From_Empty.this, "Registered successfully", Toast.LENGTH_SHORT).show();
        finishAffinity();
    }

    private boolean isEmailExist(String email) {
        return database.userDao().isUserExists(email) > 0;
    }

}