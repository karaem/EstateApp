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
import com.example.estateapp.databinding.ActivityAddPaymentMethodBinding;

public class Add_PaymentMethod extends AppCompatActivity {
   private   ActivityAddPaymentMethodBinding binding;
   private String currentPaymentMethod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityAddPaymentMethodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.payPalLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentPaymentMethod= "PayPall";
                showInputFields(currentPaymentMethod);
            }
        });
        binding.masterCardLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPaymentMethod = "MasterCard";
                showInputFields(currentPaymentMethod);
            }
        });
        binding.visaLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPaymentMethod = "Visa";
                showInputFields(currentPaymentMethod);
            }
        });

        binding.nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // تنفيذ الإجراءات المطلوبة بعد الضغط على "التالي"
                Toast.makeText(Add_PaymentMethod.this, "تم إدخال البيانات بنجاح", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void showInputFields(String paymentMethod) {
        binding.inputFields.setVisibility(View.VISIBLE);
        binding.editTextCardNumber.setHint("رقم بطاقة " + paymentMethod);
    }
}