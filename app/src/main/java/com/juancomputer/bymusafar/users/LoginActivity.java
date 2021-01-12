package com.juancomputer.bymusafar.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.nsd.NsdManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.juancomputer.bymusafar.R;
import com.juancomputer.bymusafar.admin.HomeAdminActivity;
import com.ornach.nobobutton.NoboButton;

public class LoginActivity extends AppCompatActivity {

    Button btnRegistrasi;
    NoboButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    getSupportActionBar().hide();

    btnRegistrasi = (Button) findViewById(R.id.btnRegistrasi);
    btnLogin = (NoboButton) findViewById(R.id.loginBtn);

    btnRegistrasi.setOnClickListener((v) -> {
        Intent i = new Intent( LoginActivity.this, RegistrasiActivity.class);
        startActivity(i);
        finish();
            });

    btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent( LoginActivity.this, HomeAdminActivity.class);
            startActivity(i);
            finish();
        }
    });


    }
}