package com.example.m_one;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import com.example.m_one.databinding.ActivityLoginBinding;
import com.google.android.material.textfield.TextInputLayout;

//import com.example.m_one.databinding.ActivityLoginBinding;

public class loginAcivity extends AppCompatActivity {
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isempty();
            }
        });

    }
    public void isempty(){
        if (binding.tinputEmail.getEditText().getText().toString().trim().isEmpty()) {
            binding.txtSemail.setVisibility(View.VISIBLE);
        }else{
            binding.txtSemail.setVisibility(View.GONE);
            Toast.makeText(loginAcivity.this, "email not empity", Toast.LENGTH_SHORT).show();
        }
        if(binding.tinputpassword.getEditText().getText().toString().trim().isEmpty()){
            binding.txtSpassword.setVisibility(View.VISIBLE);
        }else{
            binding.txtSpassword.setVisibility(View.GONE);
        }
    }
}