package com.example.estateapp.ui;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.estateapp.R;
import com.example.estateapp.databinding.ActivityAccountSetupFillBinding;

public class Account_Setup_Fill extends AppCompatActivity {
    ActivityAccountSetupFillBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityAccountSetupFillBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.finishButton.setOnClickListener(view -> showSuccessDialog());


    }

    private void showSuccessDialog() {
        new AlertDialog.Builder(this)
                .setTitle("Account successfully created") // عنوان الحوار
                .setMessage("Lorem ipsum dolor sit amet, consectetur.") // الرسالة
                .setPositiveButton("Finish", (dialog, which) -> {
                    dialog.dismiss(); // إغلاق الحوار
                    finish(); // إنهاء النشاط
                })
                .setCancelable(false)
                .show();
    }
}