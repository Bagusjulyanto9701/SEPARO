package com.example.tubes_pemrogramanmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterAccount extends AppCompatActivity {

    EditText nama, email, password,confirmPassword;
    TextView hyperlinkLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_account);

        nama=findViewById(R.id.nama);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        confirmPassword=findViewById(R.id.confirmpassword);
        hyperlinkLogin=findViewById(R.id.tologin);

        hyperlinkLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RegisterAccount.this, LoginPage.class);
                startActivity(intent);
                finish();
            }
        });




    }
}