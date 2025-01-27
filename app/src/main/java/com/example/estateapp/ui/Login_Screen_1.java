package com.example.estateapp.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.estateapp.R;
import com.example.estateapp.databinding.ActivityLoginScreen1Binding;
import com.google.firebase.auth.FirebaseAuth;

public class Login_Screen_1 extends AppCompatActivity {
    private ActivityLoginScreen1Binding binding;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding =ActivityLoginScreen1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        auth =FirebaseAuth.getInstance();
        binding.loginButton.setOnClickListener(view -> {
            loginUser();


        });



    }
    private void loginUser() {
        String email = binding.emailEditText.getText().toString().trim();
        String password = binding.passwordEditText.getText().toString().trim();

        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "يرجى ملء جميع الحقول", Toast.LENGTH_SHORT).show();
            return;
        }

        auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                // تسجيل الدخول ناجح
                Toast.makeText(Login_Screen_1.this, "تم تسجيل الدخول بنجاح", Toast.LENGTH_SHORT).show();
                // توجيه المستخدم لنشاط آخر هنا إذا لزم الأمر
            } else {
                // فشل تسجيل الدخول
                Toast.makeText(Login_Screen_1.this, "فشل تسجيل الدخول", Toast.LENGTH_SHORT).show();
            }
        });
    }
}